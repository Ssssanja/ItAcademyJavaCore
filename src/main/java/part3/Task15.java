package part3;

public class Task15 {
    public static void main(String[] args) {
        int numberOfSimple = 0;
        int i = 50;
        while (i<=70){
            int countOfDivisors = 1;            //количество делителей
            for (int j = 2; j<=i; j++){         //перебор делителей
                if (i%j==0){
                    countOfDivisors++;
                }
            }
            if (countOfDivisors==2){            //если делителей только 2
                numberOfSimple++;               //инкремент номера числа
            }
            if (numberOfSimple==2){             //если это второе простое
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
