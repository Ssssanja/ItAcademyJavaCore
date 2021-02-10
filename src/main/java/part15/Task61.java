package part15;

import part15.api.Task61Helper;

import java.util.ArrayList;
import java.util.Collection;

public class Task61 {
    public static void main(String[] args) {
        Collection<Integer>collection = new ArrayList<>();
        for (int i = 1; i<=20; i++){
            collection.add(i);
        }
        Task61Helper helper = new Task61Helper();
        helper.printEvenInches(collection);
        helper.printEvenInchesToSantimeters(collection);
        helper.printSumOfEvenInchesInSantimetres(collection);
    }
}
