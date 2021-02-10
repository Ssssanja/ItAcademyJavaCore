package part9;

import java.util.ArrayList;
import java.util.List;

public class Task39 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i<20; i++){
            marks.add((int)(Math.random()*5 + 1));
        }
        System.out.println("Есть список с оценками:");
        System.out.println(marks.toString());
        System.out.println("Удаляем неуды, получаем:");
        int j = marks.size();
        for (int i = 0; i<j;){
            if (marks.get(i)<=2){
                marks.remove(i);
                j--;
            }
            else i++;
        }
        System.out.println(marks.toString());
    }
}
