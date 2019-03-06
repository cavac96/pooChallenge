package builders;

import models.Agent;

public abstract class AgentBuilder {
    protected String name;
    protected double cc;

    public AgentBuilder addName(String name){
        this.name = name;
        return this;
    }

    public AgentBuilder addCc(double cc) {
        this.cc = cc;
        return this;
    }
    public abstract Agent build();
}
