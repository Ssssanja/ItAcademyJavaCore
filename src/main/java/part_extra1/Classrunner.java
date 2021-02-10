package part_extra1;

import part_extra1.api.*;

public class Classrunner {
    public static void main(String[] args) {
        Vehicle[]vehickles = new Vehicle[3];
        vehickles[0] = new Bike();
        vehickles[1] = new Car();
        vehickles[2] = new Truck();

        for (Vehicle v : vehickles){
            v.move();
        }
    }



}
