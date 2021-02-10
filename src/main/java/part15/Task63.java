package part15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task63 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите минимальное число коллекции: ");
        int minValue = 0;
        try {
             minValue = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Укажите максимальное число коллекции: ");
        int maxValue = 0;
        try {
            maxValue = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer>collection = new ArrayList<>();
        for (int i = minValue; i<=maxValue; i++){
            collection.add(i);
        }
        List<Integer>result = collection.stream()
                .filter(i -> i%3==0)
                .filter(i -> i%5==0)
                .filter(i -> i!=0)
                .collect(Collectors.toList());
        if (result.isEmpty()) System.out.println("В коллекции нет чисел, которые делятся на 3 и на 5.");
        else {
            System.out.printf("В коллекции есть числа, которые делятся на 3 и на 5, их %d: \n", result.size());
            for (int x : result){
                System.out.println(x);
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
