package part7.api.additional.task34;

import part7.api.additional.task34.WorkPlases.OfficeAtPlant;

public class Accountant extends Administration implements MindWork{
    public Accountant(OfficeAtPlant officeAtPlant) {
        super(officeAtPlant);
        position = "Бухгалтер";
    }

    @Override
    public void work() {
        super.work();
        mindWork();
    }

    @Override
    public void mindWork() {

        salary = salary + placeOfWork.salaryBonus;
    }
}
