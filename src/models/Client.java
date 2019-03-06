package models;

import java.util.Random;

public class Client extends Person {
    private double balance;
    private int bankOperation;
    private final int MAX = 3;
    private final int MIN = 1;

    public Client(String name, Double cc) {
        super(name, cc);
    }

    public void chooseBankOperation(){
        Random random = new Random();
        bankOperation = random.nextInt((MAX - MIN) + 1) + MIN;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public int getBankOperation() {
        return bankOperation;
    }
}
