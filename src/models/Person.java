package models;

public abstract class Person {
    protected String name;
    protected double cc;

    public Person(String name, double cc) {
        this.name = name;
        this.cc = cc;
    }

    public Double getCc() {
        return cc;
    }

    public String getName() {
        return name;
    }
}
