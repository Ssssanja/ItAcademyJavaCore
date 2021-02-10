package part12;

public class Task53 {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            new Thread(){
                @Override
                public void run() {
                    int max = 0;
                    for (int x : makeRandomArrayOfInts()){
                        if (max<x) max = x;
                    }
                    System.out.println("Я " + Thread.currentThread().getName() + " У меня максимальный " + max);
                }
            }.start();
        }
    }
    private static int[] makeRandomArrayOfInts () {
        int[]array = new int[10];
        for (int i = 0; i<10; i++){
            array[i] = ((int) (Math.random() * 99) +1);
        }
        return array;
    }
}
