package part8.api;

public enum Seasons {
    SPRING ("Весна", 92, 1),
    SUMMER ("Лето", 92, 2),
    AUTUMN ("Осень", 91,3),
    WINTER ("Зима", 90, 4);

    private String description;
    private int countOfDays;
    private int numberOfSeason;

    Seasons(String description, int countOfDays, int numberOfSeason) {
        this.description = description;
        this.countOfDays = countOfDays;
        this.numberOfSeason = numberOfSeason;
    }

    public int getNumberOfSeason() { return numberOfSeason;}

    public int getCountOfDays() { return countOfDays;}

    public String getDescription() {
        return description;
    }
}
