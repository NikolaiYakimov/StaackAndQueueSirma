package Exercise.exc12;

public class Task {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " - " + priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}
