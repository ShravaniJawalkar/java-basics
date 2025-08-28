package org.example.streamapi;

public class Transaction {
    private String date;  // Format: "2025-08-01"
    private long amount;

    public Transaction(String date, long amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }
    public long getAmount() {
        return amount;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
}
