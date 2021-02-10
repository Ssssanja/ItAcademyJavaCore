package part7.api.additional.task34;

import part7.api.additional.task34.WorkPlases.PlaceOfWork;

public abstract class Administration extends Worker{
    public int parkingLot;

    public Administration(PlaceOfWork placeOfWork) {
        super(placeOfWork);
    }


    public void showParkingLot(){
        System.out.println(parkingLot);
    }
}
