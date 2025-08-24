package com.library;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Register User");
            System.out.println("4. View All User");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Search Book");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    //Add Books
                    System.out.print("Enter book id: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author,true));
                }
                case 2 -> library.viewBooks(); //View All Books
                case 3 -> {
                    //Register User
                    System.out.print("Enter user id: ");
                    int uid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter user name: ");
                    String uname = sc.nextLine();
                    library.registerUser(new User(uid, uname));
                }
                case 4 -> library.viewUsers();//View All Users
                case 5 -> {
                    //Borrow Book
                    System.out.print("Enter book id: ");
                    int bid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter user id: ");
                    int uid = sc.nextInt(); sc.nextLine();
                    library.borrowBook(bid, uid); // simple reference
                }
                case 6 -> {
                    //Return Book
                    System.out.print("Enter book id: ");
                    int bid = sc.nextInt();
                    library.returnBook(bid);
                }
                case 7 -> {
                    //Search Book
                    System.out.print("Enter search keyword: ");
                    String key = sc.nextLine();
                    library.searchBook(key);
                }
                case 8 -> {
                    //Exit
                    System.out.println("👋 Exiting... Bye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("❌ Invalid choice!");
            }
        }
    }
}
