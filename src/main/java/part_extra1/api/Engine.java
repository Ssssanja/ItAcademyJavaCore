package part_extra1.api;

public class Engine {
    private boolean isOn;

    public void setOn() {
        isOn = true;
        System.out.println("Двигатель завёлся");
    }
    public void setOff() {
        isOn = false;
        System.out.println("Двигатель заглушен");
    }

}
