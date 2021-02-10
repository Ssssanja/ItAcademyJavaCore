package part4;

public class Task20 {
    public static void main(String[] args) {
        int[]array = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random()*10);
        }
        int max = array[0];
        for (int i = 0; i<array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
