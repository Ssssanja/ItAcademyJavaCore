package part1;

public class Task5 {
    public static void main(String[] args) {
        int s = 900000;
        int secs = s % 60;
        int m = (s - secs) / 60;
        int mins = m % 60;
        int h = (m - mins) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int days = d % 7;
        int w = (d - days) / 7;
        System.out.println(s + " Секунд - это: \n" +
                "Недель: "  + w + "\n" +
                "Дней: " + days + "\n" +
                "Часов: " + hours + "\n" +
                "Минут: "  + mins + "\n \n" +
                "И остаточек секунд: " + secs);
    }
}
