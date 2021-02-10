package part7.api.additional.task34;

import part7.api.additional.task34.WorkPlases.PlaceOfWork;

public class Foreman extends SimpleWorkers implements HandWork, MindWork{
    int workersToChief = 0;

    public Foreman(PlaceOfWork placeOfWork, Worker ... w) {
        super(placeOfWork);
        position = "Бригадир";
        workersToChief = w.length;
    }

    @Override
    public void handWork() {
        placeOfWork.production++;
    }

    @Override
    public void work() {
        super.work();
        handWork();
        mindWork();
    }

    @Override
    public void mindWork() {
        salary += placeOfWork.salaryBonus*workersToChief*0.2;
    }
}
