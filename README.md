# Online Shop Backend

This repository contains the backend implementation for an online shop. The system supports various basic operations such as user registration, user sign-in and sign-out, product catalog navigation, adding products to the cart, submitting orders, checkout, users management, and more. It is designed to be used in further education and to be integrated into your web e-commerce application.

## Getting Started

To get started, you need to set up the project and run it on your local machine.

### Prerequisites

To run this program, you need to have Java installed on your machine.

### Clone the Repository

First, clone this repository to your local machine using the following command:

```
git clone https://github.com/your-username/online-shop-backend.git
```

### Build and Run

1. Open the terminal or command prompt and navigate to the project directory.

2. Build the project using the provided build script:

   On Windows:
   ```
   build.bat
   ```

   On macOS/Linux:
   ```
   ./build.sh
   ```

3. Once the build is successful, run the application using the provided run script:

   On Windows:
   ```
   run.bat
   ```

   On macOS/Linux:
   ```
   ./run.sh
   ```

### Main Menu Navigation

When you run the program, you will see the main menu with the following options:

1. Sign Up
2. Sign In / Sign Out
3. Product Catalog
4. My Orders
5. Settings
6. Customer List

If you are not logged in, you will see "Sign In" in the second menu option. After logging in, it will change to "Sign Out."

### Exiting the Program

To exit the program at any time, simply enter 'exit' in the console.

## Features

### Sign Up

The Sign Up feature allows new users to register in the system. During the registration process, users will be prompted to enter their first name, last name, password, and email. Each new user will have a unique ID.

### Sign In / Sign Out

The Sign In feature allows registered users to log in to their accounts. Users need to enter their email and password to log in. After successful login, they will see a welcome message and the main menu will be updated to display "Sign Out" instead of "Sign In."

### Product Catalog

The Product Catalog feature lists all available products in the online shop. Users can view the list of products and add them to their cart by entering the product ID. To return to the main menu from the catalog, simply enter 'menu' in the console.

### My Orders

The My Orders feature allows logged-in users to view a list of all their previous orders.

### Settings

The Settings feature allows users to change their account settings. Currently, it supports changing the password and email. Users will be prompted to enter their new password or email, and upon success, they will see a confirmation message.

### Customer List

The Customer List feature prints a list of all registered customers (excluding passwords) to the console.

## Technical Details

The backend implementation follows the provided technical requirements and consists of several services:

1. `UserManagementService`: Manages user registration, login, and retrieval of user information.
2. `OrderManagementService`: Manages orders and provides methods to add orders and retrieve orders by user ID.
3. `ProductManagementService`: Manages products and provides methods to retrieve products and product information.
4. `ApplicationContext`: Singleton class that manages the application state, including the logged-in user and the main menu.

Each service has an `getInstance()` method to ensure only one instance of the service exists during program execution. To facilitate testing, each service also has a `clearServiceState()` method to reset the service state.

## Conclusion

This backend implementation provides the foundation for an online shop application. It includes user registration, login, product catalog, order management, and other essential features. The project is designed to be extendable and customizable for further development of your web e-commerce application. Happy coding!e
