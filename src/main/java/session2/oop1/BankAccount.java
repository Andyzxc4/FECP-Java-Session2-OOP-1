package session2.oop1;

import java.util.ArrayList;

public class BankAccount {
    private String holder;
    private String accountNumber;
    private double balance;

    //  bank account constructor for case with initial deposit
    BankAccount (String holder, String accountNumber, double balance) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //  bank account constructor for case with no initial deposit
    BankAccount (String holder, String accountNumber) {
        this.holder = holder;
        this.accountNumber = accountNumber;
    }

    //  setters
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //  getters
    public String getHolder() {
        return holder;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }


}
