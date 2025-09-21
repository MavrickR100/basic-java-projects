#  Banking System (Java Console App with Exception Handling)

A simple **console-based Banking System** built in **Java** to demonstrate **exception handling**.  
Users can create accounts, deposit, withdraw, and check balances.

This project focuses on **custom exceptions** and how they can make applications more robust and realistic.

---

##  Features
-  **Create Account** with initial balance
-  **Deposit Money** (with validation)
-  **Withdraw Money** (with balance checks)
-  **Check Account Balance**
- ️ **Exception Handling Demonstrated:**
    - `InvalidAmountException` → when deposit/withdrawal amount ≤ 0
    - `InsufficientBalanceException` → when withdrawal > balance
    - `AccountNotFoundException` → when account number does not exist

---

##  Tech Stack
- **Language:** Java
- **Concepts Used:**
    - Custom Exceptions
    - Exception Handling (try-catch-throw-throws)
    - Object-Oriente


##  Project Structure
BankingSystem/

├── src/

│   ├── exceptions/ 

│   │   ├── InvalidAmountException.java

│   │   ├── InsufficientBalanceException.java

│   │   └── AccountNotFoundException.java

│   │
│   ├── model/

│   │   └── Account.java

│   │
│   ├── service/

│   │   └── Bank.java

│   │
│   └── BankingApp.java

│
└── README.md


