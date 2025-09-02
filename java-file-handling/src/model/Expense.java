package model;

public class Expense {
    private final String date;        // yyyy-mm-dd
    private final String category;    // Food, Travel, Bills etc.
    private final double amount;
    private final String description;

    public Expense(String date, String category, double amount, String description) {
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String toString() {
        return date + "," + category + "," + amount + "," + description;
    }

    public static Expense fromString(String line) {
        String[] parts = line.split(",");
        return new Expense(parts[0], parts[1], Double.parseDouble(parts[2]), parts[3]);
    }

}