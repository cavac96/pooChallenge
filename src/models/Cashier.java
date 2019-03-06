package models;

public class Cashier extends Agent {
    private static final int priority = 1;

    public Cashier(String name, double cc) {
        super(name, cc);
    }

    @Override
    public int getPriority() {
        return priority;
    }
}
