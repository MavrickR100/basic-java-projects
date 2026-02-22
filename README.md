# 🚀 basic-java-projects

A collection of **basic Java console applications** demonstrating core Java concepts such as:

- ✅ Exception Handling  
- ✅ Java Collection Framework  
- ✅ File Handling  
- ✅ Object-Oriented Programming (OOP)  
- ✅ Custom Exceptions  
- ✅ CRUD Operations  

Each project is structured independently and focuses on a specific core Java concept.

---

# 📂 Projects Included

---

## 1️⃣ Exception Handling – Banking System

A **console-based Banking System** built to demonstrate **custom exception handling** and robust validation logic.

### 📌 Features
- Create Account with initial balance
- Deposit Money (with validation)
- Withdraw Money (with balance checks)
- Check Account Balance
- Custom Exceptions:
  - `InvalidAmountException`
  - `InsufficientBalanceException`
  - `AccountNotFoundException`

### 🧠 Concepts Covered
- Custom Exceptions
- `try-catch-throw-throws`
- OOP (Encapsulation & Abstraction)
- Service-layer architecture

### 📁 Structure
```
exception-handling/
├── src/
│   ├── exceptions/
│   ├── model/
│   ├── service/
│   └── BankingApp.java
```

---

## 2️⃣ Java Collections – Library Management System

A **Library Management System** demonstrating the use of the **Java Collection Framework** along with OOP principles.

### 📌 Features
- Add new books
- Search by Title, Author, or Book ID
- Borrow and return books
- Prevent duplicate book entries
- Map users to borrowed books
- Display available & borrowed books

### 🧠 Concepts Covered
- `HashSet` → Store unique books
- `HashMap` → Map users to borrowed books
- `ArrayList` → Store borrowed book list
- `Queue` (optional) → Waitlist handling
- OOP (Encapsulation, Abstraction, Polymorphism)

### 📁 Structure
```
java-collections/
├── src/
│   └── com/library/
│       ├── Book.java
│       ├── User.java
│       ├── Library.java
│       └── LibraryApp.java
```

---

## 3️⃣ File Handling – Expense Tracker

A **console-based Expense Tracker** built to demonstrate **file read/write/update/delete operations** using Java.

All expense data is stored in a text file (`expenses.txt`).

### 📌 Features
- Add Expense (date, category, amount, description)
- View All Expenses
- Search by Category
- Update Expense
- Delete Expense
- Persistent storage using file handling

### 🧠 Concepts Covered
- `BufferedReader`
- `BufferedWriter`
- `FileReader`
- `FileWriter`
- CRUD operations
- Menu-driven console UI

### 📁 Structure
```
java-file-handling/
├── src/
│   ├── model/
│   ├── service/
│   ├── utils/
│   └── ExpenseApp.java
├── text-files/
│   └── expenses.txt
```

---

# 🛠 Tech Stack

- **Java 8+ (Recommended: Java 17+)**
- Console-based applications
- No external dependencies
- Core Java concepts only

---

# ▶️ How to Run Any Project

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/basic-java-projects.git
   ```

2. Navigate to the desired project folder:
   ```bash
   cd basic-java-projects/<project-folder>
   ```

3. Compile:
   ```bash
   javac -d bin src/**/*.java
   ```

4. Run:
   ```bash
   java -cp bin <MainClassName>
   ```

Or simply run using your IDE (IntelliJ / Eclipse / VS Code).

---

# 🎯 Learning Goals

This repository is ideal for:

- Beginners learning Java fundamentals
- Students preparing for interviews
- Practicing OOP design
- Understanding core backend logic
- Strengthening Java basics before moving to Spring Boot

---

# 📌 Future Enhancements (Planned)

- Add JDBC-based project
- Add Multithreading example
- Add Unit Testing (JUnit)
- Convert console apps into REST APIs (Spring Boot)

---

# 🤝 Contributing

Feel free to fork the repository and improve the projects.  
Pull requests are welcome!

---

# 📄 License

This project is open-source and available for learning purposes.
