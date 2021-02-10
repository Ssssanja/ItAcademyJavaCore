package part7;

import part7.api.additional.task32.*;

public class Task32 {
    public static void main(String[] args) {
        EmbeddedCoffeeMaker coffeeMaker = new EmbeddedCoffeeMaker(30,30,40);
        Fridge fridge = new Fridge(90,200,100);
        Microwave microwave = new Microwave(50,40,40);
        TV tv = new TV(150, 100, 3);
        VacuumCleaner vacuumCleaner = new VacuumCleaner(15);
        coffeeMaker.cook();
        fridge.plugIn();
        fridge.freeze();
        microwave.heat();
        tv.plugIn();
        tv.showMovie();
        vacuumCleaner.clean();
        coffeeMaker.getMeasures();
        System.out.printf("Объём встраиваемой кофемашинки составляет %.2f.\n", coffeeMaker.volumeInfo());
    }
}
