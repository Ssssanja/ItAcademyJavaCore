package part7.api.additional.task32;


public class Microwave extends KitchenAppliances implements FreeStandingAppliances, Heatable {
    double width;
    double height;
    double lenght;

    public Microwave(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.lenght = length;
    }

    @Override
    public void getMeasuresInfo() {
        System.out.printf("Размеры микроволновочки: %.2f на %.2f на %.2f.\n", width, height, lenght);
    }

    @Override
    public void heat() {
        if (isPlugOn) {
            System.out.println("Микроволновка греет");
        }
        else {
            System.out.println("Сначала включи в розетку микроволновку");
        }
    }
}
