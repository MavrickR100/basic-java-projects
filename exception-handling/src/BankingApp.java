import service.Bank;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter account number: ");
                        int accNo = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter holder name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter initial balance: ");
                        double initBal = sc.nextDouble();
                        bank.createAccount(accNo, name, initBal);
                        System.out.println("✅ Account created successfully!");
                    }
                    case 2 -> {
                        System.out.print("Enter account number: ");
                        int accDep = sc.nextInt();
                        System.out.print("Enter amount: ");
                        double depAmt = sc.nextDouble();
                        bank.getAccount(accDep).deposit(depAmt);
                        System.out.println("✅ Deposit successful!");
                    }
                    case 3 -> {
                        System.out.print("Enter account number: ");
                        int accWith = sc.nextInt();
                        System.out.print("Enter amount: ");
                        double withAmt = sc.nextDouble();
                        bank.getAccount(accWith).withdraw(withAmt);
                        System.out.println("✅ Withdrawal successful!");
                    }
                    case 4 -> {
                        System.out.print("Enter account number: ");
                        int accBal = sc.nextInt();
                        System.out.println(bank.getAccount(accBal));
                    }
                    case 5 -> {
                        System.out.println("Exiting... Thank you!");
                        return;
                    }
                    default -> System.out.println("❌ Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("⚠️ Error: " + e.getMessage());
            }
        }
    }
}

