package builders;

import models.Client;

public class ClientBuilder {
    protected String name;
    protected double cc;

    public ClientBuilder addName(String name){
        this.name = name;
        return this;
    }

    public ClientBuilder addCc(double cc) {
        this.cc = cc;
        return this;
    }

    public Client build(){
        Client client = new Client(name, cc);
        return client;
    }
}
