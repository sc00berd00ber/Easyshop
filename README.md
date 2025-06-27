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

## Screenshots

### Home Page
![Screenshot 2025-06-26 115856](https://github.com/user-attachments/assets/18384d92-71bb-42c4-8dab-ab5c67cd4f0f)

### Cart
![Screenshot 2025-06-26 115958](https://github.com/user-attachments/assets/5206044d-1e93-469f-8c24-c3536da8eca7)

### Login Page
![Screenshot 2025-06-26 120718](https://github.com/user-attachments/assets/ab2cdc3a-4b9c-431e-a76b-3d11a3584982)

### Profile
![Screenshot 2025-06-26 120048](https://github.com/user-attachments/assets/47174c82-92e6-4ce7-abb2-3ad13317395a)

### Postman Tests
![Screenshot 2025-06-26 152420](https://github.com/user-attachments/assets/0f941274-e62f-4d16-a80d-ba51af46cfc5)
