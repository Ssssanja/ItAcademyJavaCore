package part8;

import part8.api.SeasonHelper;
import part8.api.Seasons;

public class Task36 {
    public static void main(String[] args) {
        SeasonHelper seasonHelper = new SeasonHelper();
        seasonHelper.printHelper(Seasons.AUTUMN);
        seasonHelper.printHelper(Seasons.WINTER);
        seasonHelper.printHelper(Seasons.SPRING);
        seasonHelper.printHelper(Seasons.SUMMER);
    }
}
