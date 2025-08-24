package com.library;

import java.util.*;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final Set<User> users = new HashSet<>();

    private final Map<Integer, User> userMap = new HashMap<>();
    private final Map<Integer, Queue<User>> waitingList = new HashMap<>();

    // Add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("✅ Book added: " + book);
    }

    // Register user
    public void registerUser(User user) {
        if (users.add(user)) {  // Set ensures uniqueness
            userMap.put(user.getId(), user);  // also keep in map for lookup
            System.out.println("✅ User registered: " + user);
        } else {
            System.out.println("⚠️ User already exists!");
        }
    }

    //View all Users
    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("📚 No Users present.");
            return;
        }
        users.forEach(System.out::println);
    }

    // View all books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("📚 No books in library.");
            return;
        }
        books.forEach(System.out::println);
    }

    // Borrow book
    public void borrowBook(int bookId, int userId) {
        User user = userMap.get(userId);  // fetch real user
        if (user == null) {
            System.out.println("❌ User not found! Please register first.");
            return;
        }

        Optional<Book> bookOpt = books.stream().filter(b -> b.getId() == bookId).findFirst();
        if (bookOpt.isEmpty()) {
            System.out.println("❌ Book not found!");
            return;
        }
        Book book = bookOpt.get();
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("✅ " + user.getName() + " borrowed " + book.getTitle());
        } else {
            waitingList.putIfAbsent(bookId, new LinkedList<>());
            waitingList.get(bookId).add(user);
            System.out.println("⏳ Book is not available. " + user.getName() + " added to waiting list.");
        }
    }

    // Return book
    public void returnBook(int bookId) {
        Optional<Book> bookOpt = books.stream().filter(b -> b.getId() == bookId).findFirst();
        if (bookOpt.isEmpty()) {
            System.out.println("❌ Book not found!");
            return;
        }
        Book book = bookOpt.get();
        Queue<User> queue = waitingList.get(bookId);

        if (queue != null && !queue.isEmpty()) {
            User nextUser = queue.poll();
            System.out.println("📖 Book assigned to waiting user: " + nextUser.getName());
        } else {
            book.setAvailable(true);
            System.out.println("✅ Book returned: " + book.getTitle());
        }
    }

    // Search books
    public void searchBook(String keyword) {
        books.stream()
                .filter(b -> b.getTitle().toLowerCase().contains(keyword.toLowerCase())
                        || b.getAuthor().toLowerCase().contains(keyword.toLowerCase())
                        || String.valueOf(b.getId()).equals(keyword))
                .forEach(System.out::println);
    }

}
