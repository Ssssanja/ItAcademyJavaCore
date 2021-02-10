package part16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Task64 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер месяца: ");
        int numberOfMonth = 0;
        try {
           numberOfMonth = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalDate date = LocalDate.of(LocalDate.now().getYear(), numberOfMonth,1);
        int lastDayOfMonth = date.lengthOfMonth();
        for (int i = 1; i <= lastDayOfMonth; i++){
            System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
            date = date.plusDays(1);
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
