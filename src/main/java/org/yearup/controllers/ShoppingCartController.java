package org.yearup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.yearup.data.ShoppingCartDao;
import org.yearup.data.UserDao;
import org.yearup.data.ProductDao;
import org.yearup.models.ShoppingCart;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/cart")
@CrossOrigin
@PreAuthorize("isAuthenticated()") // only allow logged-in users
public class ShoppingCartController {

    private final ShoppingCartDao cartDao;
    private final UserDao userDao;
    private final ProductDao productDao;

    @Autowired
    public ShoppingCartController(ShoppingCartDao cartDao, UserDao userDao, ProductDao productDao) {
        this.cartDao = cartDao;
        this.userDao = userDao;
        this.productDao = productDao;
    }

    // GET /cart
    @GetMapping("")
    public ShoppingCart getCart(Principal principal) {
        String username = principal.getName();
        int userId = userDao.getByUsername(username).getUserId();
        return cartDao.getCartByUserId(userId);
    }

    // POST /cart/products/{productId}
    @PostMapping("/products/{productId}")
    public void addProductToCart(@PathVariable int productId, Principal principal) {
        String username = principal.getName();
        int userId = userDao.getByUsername(username).getUserId();
        cartDao.addOrUpdate(userId, productId, 1); // adds or increments quantity
    }

    // PUT /cart/products/{productId}
    @PutMapping("/products/{productId}")
    public void updateQuantity(@PathVariable int productId, @RequestBody Map<String, Integer> body, Principal principal) {
        int quantity = body.get("quantity");
        String username = principal.getName();
        int userId = userDao.getByUsername(username).getUserId();
        cartDao.updateQuantity(userId, productId, quantity);
    }

    // DELETE /cart
    @DeleteMapping("")
    public void clearCart(Principal principal) {
        String username = principal.getName();
        int userId = userDao.getByUsername(username).getUserId();
        cartDao.clearCart(userId);
    }
}
