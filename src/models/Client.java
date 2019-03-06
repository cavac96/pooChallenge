package models;

import enunms.Operation;
import java.util.Optional;
import utils.Utils;

public class Client extends Person {
    private double balance;
    private Operation bankOperation;
    private Optional<Double> depositValue;
    private Optional<Double> withdrawalValue;

    public Client(String name, Double cc) {
        super(name, cc);
        generateRandomBalance();
        chooseBankOperation();
        checkAdditionalValues();
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

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void chooseBankOperation(){
        int index = Utils.generateRandomInt(1, 3);
        this.bankOperation = Operation.values()[index-1];
    }

    public void checkAdditionalValues(){
        if(bankOperation == Operation.DEPOSIT)
            generateRandomDepositValue();
        else if(bankOperation == Operation.WITHDRAWL)
            generateWithdrawalValue();
    }

    private void generateRandomBalance(){
        this.balance = Utils.generateRandomDouble(10000, 1000000);
    }

    public void generateRandomDepositValue(){
        this.depositValue = Optional.of(Utils.generateRandomDouble(10000, 1000000));
    }

    public void generateWithdrawalValue(){
        this.withdrawalValue = Optional.of(Utils.generateRandomDouble(50000, 1000000));
    }

}
