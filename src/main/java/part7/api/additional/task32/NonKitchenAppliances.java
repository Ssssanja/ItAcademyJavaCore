package part7.api.additional.task32;

public class NonKitchenAppliances extends HouseholdAppliances{
    @Override
    public void plugIn() {
        isPlugOn = true;
    }

    @Override
    public void plugOff() {
        isPlugOn = false;
    }
}
