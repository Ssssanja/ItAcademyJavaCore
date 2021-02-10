package part7.api.additional.task34;

import part7.api.additional.task34.WorkPlases.OfficeAtPlant;

public class SalesMan extends Administration implements MindWork{

    public SalesMan(OfficeAtPlant officeAtPlant) {
        super(officeAtPlant);
        position = "Продаван";
    }

    @Override
    public void mindWork() {
        boolean itIsNiceDayToSale = ((int) (Math.random() * 5) ==0);
        if (itIsNiceDayToSale) {
            int experience = workdays / 365;
            double efficiency = 0.1 + 0.1 * experience;
            salary = salary * placeOfWork.salaryBonus + placeOfWork.production * efficiency + placeOfWork.salaryBonus * efficiency;
        }
    }

    @Override
    public void work() {
        super.work();
        mindWork();
    }
}

