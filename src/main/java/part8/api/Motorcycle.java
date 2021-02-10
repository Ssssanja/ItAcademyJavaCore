package part8.api;

public class Motorcycle extends Vehicle{
    private final String description = "Моцык";

    public String getDescription() {
        return description;
    }

    public Motorcycle(String name) {
        super(name);
    }
}
