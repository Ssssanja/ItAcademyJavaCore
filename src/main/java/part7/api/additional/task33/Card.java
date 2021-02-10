package part7.api.additional.task33;

import java.io.IOException;

public abstract class Card {
    double awailableSum;
    public void topUp (double sum) {
        awailableSum +=sum;}
    public void withdraval (double sum) throws IOException {
        System.out.println("С карты снято: " + sum);
        awailableSum -=sum;}
    public void showAwailableSum () {
        System.out.println("На карте имеется " + awailableSum);
    }
}
