package part9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task41 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i<20; i++){
            marks.add((int)(Math.random()*10 + 1));
        }
        System.out.println("Есть список с оценками:");
        System.out.println(marks.toString());
        System.out.println("Ищем самую высокую оценку итератором, получаем:");
        int maxMark = 0;
        Iterator<Integer>iterator = marks.listIterator();
        while (iterator.hasNext()){
            int temp = iterator.next();
            if (maxMark<temp){
                maxMark = temp;
            }
        }
        System.out.println(maxMark);
    }
}
