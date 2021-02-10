package part16;

import java.time.LocalDate;

public class Task66 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Текущая дата: " + date);
        date = date.minusDays(60);
        System.out.println("Дата 60 дней назад: " + date);
    }
}
