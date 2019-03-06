package models;

import utils.Utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Agent extends Person{
    private final static Logger LOGGER = Logger.getLogger("bank.agent");

    public Agent(String name, Double cc){
        super(name, cc);
    }

    public void deposit(Client client){
        double current = client.getBalance();
        double value = client.getDepositValue();
        client.setBalance( current + value);
        String message = "To deposit: \n\tbalance: \t"+current+"\n\tdeposit value: \t"+value+"\n\tnew balance: \t"+client.getBalance();
        writeOnLog(message);
    }

    public boolean withdrawal(Client client){
        double current = client.getBalance();
        double value = client.getWithdrawalValue();
        boolean isEnough = false;
        String message = "F - ";
        if(current >= value){
            client.setBalance(current - value);
            message = "T - ";
            isEnough = true;
        }
        message +="To withdrawal: \n\tbalance: \t"+current+"\n\twithdrawal value: \t"+value+"\n\tnew balance: \t"+client.getBalance();
        writeOnLog(message);
        return isEnough;
    }

    public boolean resolveIssue(){
        boolean isSolved = Utils.generateRandomBoolean();
        String message = "To solve issue: \n\tsolved: "+isSolved;
        writeOnLog(message);
        return isSolved;
    }

    public void attendTime() throws InterruptedException {
        int milliseconds = Utils.generateRandomInt(10000, 15000);
        Thread.sleep(milliseconds);
    }

    public void attend(Client client) throws InterruptedException {
        attendTime();
        switch (client.getBankOperation()){
            case DEPOSIT:
                deposit(client);
                break;
            case WITHDRAWL:
                withdrawal(client);
                break;
            case ISSUE:
                resolveIssue();
                break;
            default:
        }
    }

    public void writeOnLog(String message){
        LOGGER.log(Level.INFO, "\n"+message);
    }

    public abstract int getPriority();

}
