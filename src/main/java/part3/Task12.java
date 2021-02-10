package part3;

public class Task12 {
    public static void main(String[] args) {
        int i = 0;
        while (i<=10){
            if (i==0){
                System.out.println("Факториал числа " + i + " равен 1");
            }
            else {
                int factorial = 1;
                int x = i;
                while (x>=1){
                    factorial *= x;
                    x--;
                }
                System.out.println("Факториал числа " + i + " равен " + factorial);
            }
            i++;
        }
    }
}
