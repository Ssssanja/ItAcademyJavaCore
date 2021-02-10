package part17;

import part17.api.Service;

public class Task67 {
    public static void main(String[] args) {
        Service service = Service.getInstance();
        Service service1 = Service.getInstance();
        System.out.println("service и service1 ссылаются на один и тот же объект?");
        System.out.println(service1==service);
        service.printCurrentDate();
        service1.printCurrentDate();
    }
}
