package part_extra;

import part_extra.api.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortCompare {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива");
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        int[]array = new int[n];
        for (int i = 0; i<n; i++){
            array[i] = (int) (Math.random()*n);
        }
        Sort[]sorts = new Sort[]{new BubbleSort(), new SelectionSort(), new ShakeSort(), new InsertionSort(), new MergeSort(), new QuickSort()};
        for (Sort s :sorts){
            checkTimeAndSort(array, s);
        }
    }

    private static void checkTimeAndSort(int[] array, Sort s) {
        long start = System.currentTimeMillis();
        s.sort(array);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(s.getName() + " отсортировала массив на " + array.length + " элементов за " + timeConsumedMillis + "мс");
    }

}
