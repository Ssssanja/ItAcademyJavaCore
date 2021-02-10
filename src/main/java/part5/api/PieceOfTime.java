package part5.api;

public class PieceOfTime implements Interval<PieceOfTime>{
    private final int seconds;
    private final int minutes;
    private final int hours;


    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public PieceOfTime(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public PieceOfTime(int totalSeconds) {
       seconds = totalSeconds%60;
       minutes = ((totalSeconds-seconds)/60)%60;
       hours = (totalSeconds-seconds-minutes*60)/3600;
    }

    public int getTotalSeconds(){
        return hours*3600+minutes*60+seconds;
    }

    @Override
    public void print() {
        System.out.println("В данном промежутке:");
        System.out.println("Всего секунд: " + getTotalSeconds());
        System.out.println("в формате час/мин/сек: " + getHours() + "/" + getMinutes() + "/" + getSeconds());
    }

    @Override
    public int compareTo(PieceOfTime pieceOfTime) {
        return this.getTotalSeconds() - pieceOfTime.getTotalSeconds();
    }


}
