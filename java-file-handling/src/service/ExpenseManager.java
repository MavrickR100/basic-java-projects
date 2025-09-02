package service;

import model.Expense;
import utils.FileHandler;

import java.io.IOException;
import java.util.*;

public class ExpenseManager {
    private final FileHandler fileHandler;

    public ExpenseManager(String filename) {
        this.fileHandler = new FileHandler(filename);
    }

    public void addExpense(Expense expense) throws IOException {
        fileHandler.writeLine(expense.toString(), true);
    }

    public List<Expense> getAllExpenses() throws IOException {
        List<String> lines = fileHandler.readAllLines();
        List<Expense> expenses = new ArrayList<>();
        for (String line : lines) {
            expenses.add(Expense.fromString(line));
        }
        return expenses;
    }

    public void deleteExpense(int index) throws IOException {
        List<String> lines = fileHandler.readAllLines();
        if (index >= 0 && index < lines.size()) {
            lines.remove(index);
            fileHandler.overwriteFile(lines);
        }
    }

    public void updateExpense(int index, Expense newExpense) throws IOException {
        List<String> lines = fileHandler.readAllLines();
        if (index >= 0 && index < lines.size()) {
            lines.set(index, newExpense.toString());
            fileHandler.overwriteFile(lines);
        }
    }

    public List<Expense> searchByCategory(String category) throws IOException {
        List<Expense> results = new ArrayList<>();
        for (Expense e : getAllExpenses()) {
            if (e.toString().toLowerCase().contains(category.toLowerCase())) {
                results.add(e);
            }
        }
        return results;
    }
}
