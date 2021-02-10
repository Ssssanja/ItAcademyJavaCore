package part3;

public class Task14 {
    public static void main(String[] args) {
        long l = 7893823445L;
        int sum = 0;
        do {
            sum += l % 10;      //суммировать остатки от деления на 10 (последнюю цифру)
            l/=10;              //число делить на 10 (избавиться от посчитанного)
        }while (l>0);
        System.out.println(sum);
    }
}
