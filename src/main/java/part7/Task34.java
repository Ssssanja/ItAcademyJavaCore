package part7;

import part7.api.additional.task34.Accountant;
import part7.api.additional.task34.Carpenter;
import part7.api.additional.task34.Foreman;
import part7.api.additional.task34.SalesMan;
import part7.api.additional.task34.WorkPlases.Plant;

public class Task34 {
    public static void main(String[] args) {
        Plant plant = new Plant("Тополёк");
        Accountant accountant = new Accountant(plant.getOffice());
        SalesMan salesMan = new SalesMan(plant.getOffice());
        Carpenter carpenter1 = new Carpenter(plant);
        Carpenter carpenter2 = new Carpenter(plant);
        Carpenter carpenter3 = new Carpenter(plant);
        Carpenter carpenter4 = new Carpenter(plant);
        Carpenter carpenter5 = new Carpenter(plant);
        Foreman foreman = new Foreman(plant, carpenter1, carpenter2, carpenter3);
        plant.addWorker(accountant);
        plant.addWorker(salesMan);
        plant.addWorker(carpenter1);
        plant.addWorker(carpenter2);
        plant.addWorker(carpenter3);
        plant.addWorker(carpenter4);
        plant.addWorker(carpenter5);
        plant.addWorker(foreman);
        for (int i = 0; i<800; i++){
            plant.work();
        }
        plant.showSalaryOfEachWorker();
    }
}
