#  Expense Tracker (Java Console App)

A simple **console-based Expense Tracker** built in **Java** that demonstrates **file handling (read/write/update/delete)** operations.  
Users can add, view, search, update, and delete expenses, with data stored in a text file (`expenses.txt`).


---

##  Features
-  **Add Expense** (date, category, amount, description)
-  **View All Expenses** (from file)
-  **Search by Category**
- **Update Expense**
-  **Delete Expense**
-  Data persistence using `expenses.txt`

---

##  Tech Stack
- **Language:** Java
- **Concepts Used:**
    - File Handling (BufferedReader, BufferedWriter, FileWriter, FileReader)
    - Object-Oriented Programming (OOP)
    - Console-based menu-driven application

---

##  Project Structure
```
java-file-handling/
├── src/
│ ├── model/Expense.java # Entity class
│ ├── service/ExpenseManager.java # Business logic (CRUD)
│ ├── utils/FileHandler.java # File operations
│ ├── ExpenseApp.java # Main app (console UI)
├── text-files/expenses.txt # File storage for expenses
└── README.md # Documentation

```

