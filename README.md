<div align="center">
<img src="https://github.com/user-attachments/assets/5a0a82cc-884a-47bd-8588-d942a8b26504" alt="Description" width="500" height="300">
</div>

# E-Commerce Spring Boot Application

A full-stack e-commerce web application backend built using **Spring Boot**. It supports user authentication, shopping cart management, user profiles, product browsing, and admin-level category and product management.

## 🔧 Technologies Used

- Java 17+
- Spring Boot
- Spring Security (JWT-based)
- JDBC with MySQL
- Maven
- RESTful APIs

## 📦 Features

### 🛒 User Functionality
- Register and log in
- Browse products and categories
- View, update, and clear shopping cart
- View and update user profile

### 🔐 Admin Functionality
- Add, update, delete products and categories
- Restrict access to admin-only endpoints using roles

### 🧾 API Overview

#### Auth
- `POST /register` - Register a new user
- `POST /login` - Login and receive JWT token

#### Products
- `GET /products` - List products with filters
- `POST /products` - *(Admin only)* Add product
- `PUT /products/{id}` - *(Admin only)* Update product
- `DELETE /products/{id}` - *(Admin only)* Delete product

#### Categories
- `GET /categories` - List all categories
- `POST /categories` - *(Admin only)* Add category
- `PUT /categories/{id}` - *(Admin only)* Update category
- `DELETE /categories/{id}` - *(Admin only)* Delete category

#### Cart
- `GET /cart` - View shopping cart
- `POST /cart/products/{productId}` - Add product to cart
- `PUT /cart/products/{productId}` - Update quantity
- `DELETE /cart` - Clear cart

#### Profile
- `GET /profile` - View user profile
- `PUT /profile` - Update user profile

