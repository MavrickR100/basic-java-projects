import model.Expense;
import service.ExpenseManager;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ExpenseApp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager("java-file-handling/text-files/expenses.txt");

        while (true) {
            System.out.println("\n--- Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Search by Category");
            System.out.println("4. Update Expense");
            System.out.println("5. Delete Expense");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter date (yyyy-mm-dd): ");
                    String date = sc.nextLine();
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();
                    manager.addExpense(new Expense(date, category, amount, desc));
                }
                case 2 -> {
                    List<Expense> all = manager.getAllExpenses();
                    for (int i = 0; i < all.size(); i++) {
                        System.out.println(i + " -> " + all.get(i));
                    }
                }
                case 3 -> {
                    System.out.print("Enter category to search: ");
                    String cat = sc.nextLine();
                    List<Expense> results = manager.searchByCategory(cat);
                    results.forEach(System.out::println);
                }
                case 4 -> {
                    System.out.print("Enter index to update: ");
                    int idxU = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new date (yyyy-mm-dd) : ");
                    String newDate = sc.nextLine();
                    System.out.print("Enter new category: ");
                    String newCat = sc.nextLine();
                    System.out.print("Enter new amount: ");
                    double newAmt = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter new description: ");
                    String newDesc = sc.nextLine();
                    manager.updateExpense(idxU, new Expense(newDate, newCat, newAmt, newDesc));
                }
                case 5 -> {
                    System.out.print("Enter index to delete: ");
                    int idxD = sc.nextInt();
                    manager.deleteExpense(idxD);
                }
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
