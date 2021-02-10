package part3;

import java.math.BigInteger;

public class Task13 {
    public static void main(String[] args) {
        int i = 1;
        BigInteger result = new BigInteger(String.valueOf(1));
        do {
            result = result.multiply(new BigInteger(String.valueOf(i)));
            i++;
        }while (i<=25);
        System.out.println("Произведение чисел от 1 до 25 равно " + result);
    }
}
