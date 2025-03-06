# Product Inventory Management System

## Overview
This project is a Java-based application for managing product inventory. It supports basic CRUD (Create, Read, Update, Delete) operations for products and also includes an extended product inventory management system with the following entities:

Product - Represents individual products in the inventory.
Category - Represents categories that products belong to (e.g., electronics, clothing).
Supplier - Represents suppliers that provide products.
PurchaseOrder - Represents orders placed to suppliers for products.
OrderItem - Represents line items in a purchase order.
The application uses Java Persistence API (JPA) to map entities to a relational database and performs CRUD operations using a DAO (Data Access Object) or repository layer.

## Features
CRUD Operations for Products: Add, update, delete, and view products in the inventory.
Product Categorization: Products can be categorized into different categories like electronics, clothing, etc.
Supplier Management: Manage suppliers who provide products.
Purchase Order Management: Keep track of purchase orders placed to suppliers.
Order Item Management: Handle line items in a purchase order, specifying which products are ordered, along with their quantity and price.

## Technologies Used
Java: Programming language used for implementing the application.
Spring Boot: Framework used to create the application.
JPA (Java Persistence API): For entity mapping to a relational database.
Hibernate: JPA implementation for interacting with the database.
MySQL: Database used for storing entities.
Lombok: To reduce boilerplate code (getters, setters).
Maven: Dependency management and build tool.
