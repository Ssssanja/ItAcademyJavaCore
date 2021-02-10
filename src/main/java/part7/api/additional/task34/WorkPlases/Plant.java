package part7.api.additional.task34.WorkPlases;

import part7.api.additional.task34.Worker;

import java.util.ArrayList;
import java.util.List;

public class Plant extends PlaceOfWork {
    private OfficeAtPlant office;
    public Plant(String name) {
        this.name = "Завод " + name;
        office = new OfficeAtPlant(this);
    }

    private List<Worker>workers = new ArrayList<>();
    public void addWorker (Worker worker){
        workers.add(worker);
    }

    @Override
    public void work() {
        office.production++;
        super.work();
        for (Worker w : workers){
            w.work();
        }
    }
    public void showSalaryOfEachWorker () {
        for (Worker w : workers){
            w.showSalary();
        }
    }

    public OfficeAtPlant getOffice() {
        return office;
    }

    public double salaryBonus = 1.5;


}
