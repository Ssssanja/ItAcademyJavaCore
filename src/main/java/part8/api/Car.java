package part8.api;

public class Car extends Vehicle{
    public String getDescription() {
        return description;
    }

    private final String description = "Тачка";

    public Car(String name) {
        super(name);
    }
}
