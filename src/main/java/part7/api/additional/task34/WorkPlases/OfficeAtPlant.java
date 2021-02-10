package part7.api.additional.task34.WorkPlases;

public class OfficeAtPlant extends PlaceOfWork {
    public OfficeAtPlant(Plant plant) {
        this.name = "Оффис " + plant.name;
    }
}
