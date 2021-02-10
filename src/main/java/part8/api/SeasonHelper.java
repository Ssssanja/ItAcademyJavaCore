package part8.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static part8.api.Seasons.*;

public class SeasonHelper {

    public void printHelper(Seasons s) {
        int number = s.getNumberOfSeason();
        if (number<4) number++;
        else number = 1;
        printHelper(s, number);
    }

    public void printDays (){
        System.out.println("Введите название сезона, пожалуйста:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = reader.readLine();
            Seasons s = getSeason(input);
            if (s==null) System.out.println("Не бывает такого сезона");
            else System.out.printf("Сумма дней для сезона %s: %d", s.getDescription(), s.getCountOfDays());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printHelper(Seasons s, int number) {
        System.out.printf("Следующим за сезоном %s является сезон %s\n", s.getDescription(),
                getSeason(number).getDescription());
    }

    private Seasons getSeason (int numberOfSeason){
        if (numberOfSeason==1){
            return SPRING;
        }
        if (numberOfSeason==2){
            return SUMMER;
        }
        if (numberOfSeason==3){
            return AUTUMN;
        }
        else{
            return WINTER;
        }
    }

    private Seasons getSeason (String seasonName){
        Seasons result = null;
        if (seasonName.equalsIgnoreCase(SPRING.getDescription())){
            result = SPRING;
        }
        if (seasonName.equalsIgnoreCase(SUMMER.getDescription())){
            result = SUMMER;
        }
        if (seasonName.equalsIgnoreCase(AUTUMN.getDescription())){
            result = AUTUMN;
        }
        if (seasonName.equalsIgnoreCase(WINTER.getDescription())){
            result = WINTER;
        }
        return result;
    }



}
