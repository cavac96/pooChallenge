package models;

public class Supervisor extends Agent {
    private static final int priority = 2;

    public Supervisor(String name, Double cc) {
        super(name, cc);
    }

    @Override
    public int getPriority() {
        return priority;
    }
}
