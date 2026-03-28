# Finance Tracker - Personal Expense Management System

A robust command-line application designed to manage personal finances, developed as part of an intensive self-study journey into Object-Oriented Programming (OOP) in Java.

## About the Project
This project serves as a practical application of core Java concepts. It allows users to track daily expenses, categorize them dynamically, and generate financial summaries. The primary focus was on implementing a clean architecture with a clear separation of concerns.

## Key Features
 **Expense Registration:** Log purchase names, prices, and dates within specific categories.
 **Category Management:** Automated grouping of expenses using advanced data structures (`HashMap`).
 **Reporting Engine:** * List all active expense categories.
    * Calculate total spending for a specific category.
    * Comprehensive overview of all recorded transactions.
* **Data Validation:** Built-in logic to ensure date consistency and input integrity.

## 🛠️ Technologies & Concepts
* **Java SE**
* **Collections Framework:** Heavy use of `HashMap` and `ArrayList` for efficient data management.
* **Object-Oriented Design:** * **Encapsulation:** Protecting data integrity within models.
    * **Composition:** Designing complex objects (the `Purchase` class incorporates `SimpleData`).
* **Clean Code Principles:** Strict separation between the User Interface (`UI` class) and Business Logic (`Expense` class).



## 📋 Usage Example
```
List of operation:
Add new expense - 0
List of categories - 1
Exit - -1

Selection: 0
Category of expense: Groceries
Name of expense: Bread
Price of expense: 4.50
Day: 15
Month: 03
Year: 2024
```
## Project Structure

* Main: The entry point of the application.
* UI: Handles all user interactions and input parsing (Scanner).
* Expense: The core engine managing the data structures and calculations.
* Purchase: A data model representing a single financial transaction.
* SimpleData: A custom implementation for date handling and validation.

## How to Run
* 1.Clone the repository: git clone https://github.com/YourUser/FinanceTracker.git
* 2.Compile the .java files located in the src directory.
* 3.Run the Main class.
