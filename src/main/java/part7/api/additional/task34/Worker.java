package part7.api.additional.task34;

import part7.api.additional.task34.WorkPlases.PlaceOfWork;

public abstract class Worker {
    int workdays;
    public String position;
    double salary = 0;
    public PlaceOfWork placeOfWork;

    public void work(){
        salary++;
        workdays++;
    }

    public void showSalary(){
        System.out.printf("Я %s, отработал дней: %d. На сегодняшний день я заработал столько: %f\n", position, workdays, salary);
    }

    public Worker(PlaceOfWork placeOfWork) {
        this.placeOfWork = placeOfWork;
    }
}
