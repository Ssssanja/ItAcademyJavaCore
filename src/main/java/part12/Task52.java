package part12;

import java.util.ArrayList;
import java.util.List;

public class Task52 {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            new Thread(){
                @Override
                public void run() {
                    double summ = 0;
                    for (int x : makeRandomListOfInts()){
                        summ+=x;
                    }
                    double result = summ / 10.0;
                    System.out.println("Я " + Thread.currentThread().getName() + " Я насчитал " + result);
                }
            }.start();
        }
    }
    private static List<Integer> makeRandomListOfInts () {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i<=10; i++){
            list.add((int) (Math.random() * 20) +1);
        }
        return list;
    }
}
