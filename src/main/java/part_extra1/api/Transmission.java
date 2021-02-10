package part_extra1.api;

public class Transmission {
    private boolean isOn;
    public void setOn(){
        isOn = true;
        System.out.println("Включаем передачу");
    }
    public void setOff(){
        isOn = false;
        System.out.println("Выключаем передачу");
    }

}
