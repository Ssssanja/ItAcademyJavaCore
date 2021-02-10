package part10;

import part10.api.CustException;

public class Task44 {
    public static void main(String[] args) throws CustException {
        System.out.println("Юудет выведено рандомное ненулевое число, иначе - эксепшн");
        while (true){
            int i = (int) (Math.random() * 20);
            if (i==0){
                throw new CustException("Число оказалось нулём");
            }
            else System.out.println("Рандомное число: " + i);
        }
    }
}
