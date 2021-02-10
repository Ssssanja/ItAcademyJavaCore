package part3;

public class Task17 {
    public static void main(String[] args) {
        long m = System.currentTimeMillis();
        int i = 1212345248;
        int x = i;                                          //копия для изменений
        int lenthOfNumber = 0;                              //длина числа
        do {
            lenthOfNumber++;
            x/=10;
        }while (x>0);

        int beforeFirstSpace = lenthOfNumber%3;             //до первого пробела
        int divisioner = 10;                                //делитель для получения первой по порядку цифры

        for (int j = 1; j<lenthOfNumber-1; j++){
            divisioner*=10;                                 //вычисление макс делителя
        }

        for (int j = 0; j<lenthOfNumber; j++){              //в цикле выводится остаток от деления числа на делитель, потом отнимается первое число и уменьшается порядок делителя
            if (beforeFirstSpace!=0&&j==beforeFirstSpace){          //если есть первый пробел не 3-кратный цифрам
                System.out.print(" ");
            }
            if ((j-beforeFirstSpace)%3==0&&(j-beforeFirstSpace)!=0){    //если индекс цифры кратен 3 и если это не нулевой индекс после первого пробела
                System.out.print(" ");
            }
            System.out.print(i/divisioner);                 //первая в данный момент цифра
            i = i - (divisioner * (i/divisioner));          //отрезать первую цифру числа
            divisioner/=10;                                 //уменьшить порядок делителя
        }
        System.out.println();
        System.out.println((double) (System.currentTimeMillis() - m));
    }
}
