package part16;

import java.time.LocalDate;

public class Task65 {
    public static void main(String[] args) {
        String [] meetings = {
                "Встреча с начальством", "Встреча с клиентом", "Планёрка в цеху", "Сбор коллектива", "Обед с заказчиком",
                "Планирование на производстве", "Консультация с дизайнерами", "Собеседование у конкурентов",
                "Просмотр образцов от поставщика", "Проверка эйчара с боссом"};
        System.out.println("Расписание еженедельных встреч на ближайшие 2 месяца:");

        LocalDate date = LocalDate.now();
        LocalDate endDate = date.plusMonths(2);
        date = date.plusWeeks(1);
        while (date.isBefore(endDate)){
            System.out.println(date + " --- 13:00: " + meetings[(int) (Math.random()* meetings.length)]);
            date = date.plusWeeks(1);
        }
    }
}
