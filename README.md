# ATM Simulation Program (Java)

## 📌 Overview
This is a simple **ATM simulation program** written in Java.  
It allows multiple users to:
- Create an account with name, account number, password, and initial balance.
- Deposit money into their account.
- Withdraw money from their account (with balance check).
- Display account details.

The program demonstrates **Object-Oriented Programming (OOP)** concepts such as:
- Classes and Objects
- Encapsulation
- Methods for deposit, withdrawal, and display
- Array of objects to handle multiple accounts

---

## 🏗️ Program Structure
### 1. `Informations` class
Represents a customer’s bank account.

- **Fields:**
  - `Name` → Customer name  
  - `Accountnumber` → Unique account number  
  - `password` → Account password (not used in validation yet)  
  - `balance` → Current account balance  

- **Methods:**
  - `Deposit()` → Allows the user to deposit money.  
  - `Withdrawl()` → Allows the user to withdraw money, with insufficient balance check.  
  - `Display()` → Prints account details.  

### 2. `ATM` class (Main class)
- Creates an array of `Informations` objects to store multiple accounts.  
- Reads account details from the user.  
- Provides a **menu-driven interface** to deposit, withdraw, or exit.  
- At the end, prints all customer details.

---

## ▶️ How to Run
1. Save the code in a file named `ATM.java`.
2. Compile the program:
   ```bash
   javac ATM.java
# ATM
