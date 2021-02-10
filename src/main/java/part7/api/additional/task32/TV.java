package part7.api.additional.task32;



public class TV extends NonKitchenAppliances implements FreeStandingAppliances {
    double width;
    double height;
    double lenght;

    public TV(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    @Override
    public void getMeasuresInfo() {
        System.out.printf("Размеры телевизера: %.2f на %.2f на %.2f.\n", width, height, lenght);
    }
    public void showMovie (){
        if (isPlugOn) {
            System.out.println("Смотрим кинчик");
        }
        else {
            System.out.println("Сначала включи в розетку телек");
        }
    }
}
