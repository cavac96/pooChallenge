package models;

import enunms.Operation;

import java.util.Optional;
import java.util.Random;

public class Client extends Person {

    private double balance;
    private Operation bankOperation;
    private Optional<Double> depositValue;
    private Optional<Double> withdrawalValue;

    public Client(String name, Double cc) {
        super(name, cc);
        generateRandomBalance();
        chooseBankOperation();
        checkAditionalValues();
    }

    public void chooseBankOperation(){
        Random random = new Random();
        int index = random.nextInt((3 - 1) + 1) + 1;
        this.bankOperation = Operation.values()[index-1];
    }

    public void checkAditionalValues(){
        if(bankOperation == Operation.DEPOSIT)
            generateRandomDepositValue();
        else if(bankOperation == Operation.WITHDRAWL)
            generateWithdrawalValue();
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    private void generateRandomBalance(){
        Random random = new Random();
        double x = 10000 + (1000000 - 10000) * random.nextDouble();
        this.balance = x;
    }

    public void generateRandomDepositValue(){
        Random random = new Random();
        double x = 10000 + (1000000 - 10000) * random.nextDouble();
        this.depositValue = Optional.of(x);
    }

    public void generateWithdrawalValue(){
        Random random = new Random();
        double x = 50000 + (1000000 - 50000) * random.nextDouble();
        this.withdrawalValue = Optional.of(x);
    }

    public double getDepositValue(){
        return depositValue.get();
    }

    public double getWithdrawalValue(){
        return withdrawalValue.get();
    }


    public Operation getBankOperation() {
        return bankOperation;
    }
}
