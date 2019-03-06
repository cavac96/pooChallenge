package models;

public class Director extends Agent{
    private static final int priority = 3;

    public Director(String name, Double cc) {
        super(name, cc);
    }

    @Override
    public int getPriority() {
        return priority;
    }
}
