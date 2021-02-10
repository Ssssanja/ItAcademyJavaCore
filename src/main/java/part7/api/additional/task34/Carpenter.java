package part7.api.additional.task34;

import part7.api.additional.task34.WorkPlases.PlaceOfWork;

public class Carpenter extends SimpleWorkers implements HandWork{
    public Carpenter(PlaceOfWork placeOfWork) {
        super(placeOfWork);
        position = "Столяр";
    }

    @Override
    public void work() {
        super.work();
        handWork();
    }

    @Override
    public void handWork() {
        placeOfWork.production++;
        double experience = (workdays/365+1)*0.3;
        salary = salary + experience* placeOfWork.salaryBonus;
    }
}
