package part7.api.additional.task32;



public class Fridge extends KitchenAppliances implements FreeStandingAppliances, Freezable {
    double width;
    double height;
    double lenght;

    public Fridge(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    @Override
    public void getMeasuresInfo() {
        System.out.printf("Размеры холодоса: %.2f на %.2f на %.2f.\n", width, height, lenght);
    }

    @Override
    public void freeze() {
        if (isPlugOn) {
            System.out.println("Холодос начал холодить");
        }
        else {
            System.out.println("Сначала включи в розетку холодос");
        }
    }
}
