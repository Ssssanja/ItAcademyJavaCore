package part17.api;

import java.time.LocalDate;

public class Service {
    private static Service instance;

    private Service() {

    }

    public static Service getInstance(){
        if (instance==null){
            instance = new Service();
        }
        return instance;
    }

    public void printCurrentDate(){
        System.out.println(LocalDate.now());
    }
}
