#  Library Management System (Java Collection Framework Project)

This is a simple **Library Management System** implemented in **Java** to demonstrate the usage of the **Collection Framework** (`Set`, `Map`, `List`, `Queue`) along with **OOP concepts** like Encapsulation, Abstraction, and Polymorphism.

The project allows adding, searching, borrowing, and returning books while managing users efficiently.

---

##  Features

- Add new books to the library.
- Search books by:
    - Title
    - Author
    - Book ID
- Borrow books (one user cannot borrow the same book twice).
- Return borrowed books.
- Display available and borrowed books.
- Ensures uniqueness of books using `Set`.
- Maps users to their borrowed books using `Map`.

---

##  Tech Stack

- **Java 17+** (works with Java 8+ as well)
- **Collection Framework**
    - `HashSet` → For storing unique books.
    - `HashMap` → For mapping user → borrowed books.
    - `ArrayList` → For flexible storage of borrowed books.
    - `Queue` (optional) → For waitlist / delayed borrow system.

---

##  Project Structure

```
LibraryManagement/
│── src/
│ └── com/
│ └── library/
│ ├── Book.java # Book entity
│ ├── User.java # User entity
│ ├── Library.java # Core library operations
│ ├── LibraryApp.java # Entry point with menu-driven interface
│
└── README.md # Project documentation
```
