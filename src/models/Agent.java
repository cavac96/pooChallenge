package models;

import java.util.Random;

public abstract class Agent extends Person{

    public Agent(String name, Double cc){
        super(name, cc);
    }

    public void deposit(Client client){
        double current = client.getBalance();
        double value = client.getDepositValue();
        client.setBalance( current + value);
        System.out.println("Para un deposito: \n\tbalance: "+current+"\n\tdeposito: "+value+"\n\tdespues: "+client.getBalance());
    }

    public boolean withdrawal(Client client){
        double current = client.getBalance();
        double value = client.getWithdrawalValue();
        if(current >= value){
            client.setBalance(current - value);
            System.out.println("T - Para un retiro: \n\tbalance: "+current+"\n\tretiro: "+value+"\n\tdespues: "+client.getBalance());
            return true;
        }
        System.out.println("F - Para un retiro: \n\tbalance: "+current+"\n\tretiro: "+value+"\n\tdespues: "+client.getBalance());
        return false;
    }

    public boolean resolveIssue(){
        Random random = new Random();
        boolean isSolved = random.nextBoolean();
        System.out.println("Para un issue: \n\tresuelto: "+isSolved);
        return isSolved;
    }

    public void attend(Client client){
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

    public abstract int getPriority();

}
