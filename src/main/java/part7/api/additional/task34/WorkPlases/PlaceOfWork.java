package part7.api.additional.task34.WorkPlases;

public abstract class PlaceOfWork {
    public String name;
    public int production;
    int workDays = 0;
    public double salaryBonus = 1.0;
    void work(){
        workDays++;
    }
}
