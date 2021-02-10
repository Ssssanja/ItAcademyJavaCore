package part4;

public class Task19 {
    public static void main(String[] args) {
        int array [] = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random()*10);      //Заполняем рандомом
            if (i%2==0){                              //выводим, если чётные (ноль - чётное число)
                System.out.println("В массиве под индексом " + i + " хранится элемент " + array[i]);
            }
        }

    }
}
