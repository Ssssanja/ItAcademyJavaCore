package part9;

import java.util.*;

public class Task40 {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i<20; i++){
            randomList.add((int)(Math.random()*10));
        }
        System.out.println("Есть список с оценками:");
        System.out.println(randomList.toString());
        System.out.println("Удаляем повторы, получаем:");
        Set<Integer>tempSet = new LinkedHashSet<>(randomList);
        randomList.clear();
        for (int x : tempSet){
            randomList.add(x);
        }
        System.out.println(randomList.toString());
    }
}
