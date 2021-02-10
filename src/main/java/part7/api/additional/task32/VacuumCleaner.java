package part7.api.additional.task32;


public class VacuumCleaner extends NonKitchenAppliances implements Moovable, Cleanable, Airable {
    private double rangeOfCleaning;
    public VacuumCleaner(double rangeOfCleaning) {
        this.rangeOfCleaning = rangeOfCleaning;
    }

    @Override
    public void turnOnAirFlow() {
        System.out.println("Воздух пошёл.");
    }

    @Override
    public void clean() {
        if (isPlugOn){
            turnOnAirFlow();
            System.out.println("Пылесос пылесосит");
        }
        else {
            System.out.println("Сначала включи в розетку пылесос");
        }
    }

    @Override
    public double getLenthOfTheWire() {
        return 15;
    }
}
