package models;

public class Person {
    protected String name;
    protected Double cc;

    public Person(String name, Double cc) {
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
