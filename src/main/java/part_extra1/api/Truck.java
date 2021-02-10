package part_extra1.api;

public class Truck implements Vehicle {
    private Engine engine;
    private Transmission transmission;

    public Truck() {
        this.engine = new Engine();
        this.transmission = new Transmission();
    }

    @Override
    public void move() {
        System.out.println("Ща поедем на Грузовичке");
        engine.setOn();
        transmission.setOn();
        System.out.println("Поехали");
        transmission.setOff();
        engine.setOff();
        System.out.println("Приехали. Грузовичок запаркован");
    }
}
