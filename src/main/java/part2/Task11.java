package part2;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(scheduleOnThisDay(5));
    }
    public static String scheduleOnThisDay (int day){
        switch (day){
            case 1:
                return "В понедельник нужно лениться на работе";
            case 2:
                return "Во вторник нужно тусить";
            case 3:
                return "В среду нужно как следует поработать, а то и так уже два дня слабо";
            case 4:
                return "В четверг можно скушать булочку";
            case 5:
                return "В пятницу обязательно нужно оттянуться";
            case 6:
                return "Субботу нужно провести с семьёй";
            case 7:
                return "В воскресенье можно зяняться хобби";
            default:
                return "Нет такого дня недели";
        }
    }
}
