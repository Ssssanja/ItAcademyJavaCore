package part4;

import java.util.Arrays;

public class Task22 {
    public static void main(String[] args) {
        int[]array = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random()*10);
        }
        System.out.println("Имеется массив");               //вывод всех трёх массивов
        System.out.println(Arrays.toString(array));
        for (int i = 0; i<array.length/2; i++){             //переворачиваем, используем метод трёх стаканов
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Переворачиваем");
        System.out.println("Результат:");               //вывод всех трёх массивов
        System.out.println(Arrays.toString(array));
    }
}
