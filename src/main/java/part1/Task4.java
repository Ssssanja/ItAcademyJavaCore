package part1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(getSumOfMultiplyAndSum(10,12));
    }

    public static int getSumOfMultiplyAndSum (int a, int b){
        return (a+b)+a*b;
    }
}
