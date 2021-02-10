package part7.api.additional.task34;

import part7.api.additional.task34.WorkPlases.PlaceOfWork;

public abstract class SimpleWorkers extends Worker{
    public int numberOfWardrobe;

    public SimpleWorkers(PlaceOfWork placeOfWork) {
        super(placeOfWork);
    }

    public void showNumberOfWardrobe(){
        System.out.println(numberOfWardrobe);
    }
}
