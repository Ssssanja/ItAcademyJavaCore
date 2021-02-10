package part7.api.additional.task32;


public class EmbeddedCoffeeMaker extends KitchenAppliances implements EmbeddedAppliances, Cookable, Heatable {
    double width;
    double height;
    double lenght;

    public EmbeddedCoffeeMaker(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    @Override
    public void cook() {
        if (isPlugOn){
            heat();
            System.out.println("Делаю кофеёк");
        }
        else {
            System.out.println("Сначала включи в розетку кофемашину");
        }
    }

    @Override
    public double volumeInfo() {
        return width*height*lenght;
    }

    @Override
    public void getMeasures() {
        System.out.printf("Размеры кофемашины: %.2f на %.2f на %.2f.\n", width, height, lenght);
    }

    @Override
    public void heat() {
        System.out.println("Грею водичку");
    }
}
