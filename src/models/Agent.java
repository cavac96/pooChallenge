package models;

import java.util.Random;

public abstract class Agent extends Person{
    public Agent(String name, Double cc){
        super(name, cc);
    }

    public void deposit(Client client, double toDeposit){
        client.setBalance(client.getBalance()+toDeposit);
    }

    public boolean withdrawal(Client client, double toWithdrawl){
        double current = client.getBalance();
        if(current >= toWithdrawl){
            client.setBalance(current-toWithdrawl);
            return true;
        }
        return false;
    }

    public boolean resolveIssue(){
        Random random = new Random();
        return random.nextBoolean();
    }

    public abstract int getPriority();

}
