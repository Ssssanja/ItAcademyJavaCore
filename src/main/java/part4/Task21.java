package part4;


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Task21 {
    public static void main(String[] args) {
        int[]array = new int[20];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random()*20);
        }
        int max = array[0];
        int min = array[0];
        for (int k : array) {           //поиск мин и макс
            if (k > max) {
                max = k;
            }
            if (k < min) {
                min = k;
            }
        }
        int countMin = 0;                               //подсчёт сколько мин и сколько макс
        int countMax = 0;
        for (int k : array) {
            if (k == min) {
                countMin++;
            }
            if (k == max) {
                countMax++;
            }
        }
        int [] indexesOfMin = new int [countMin];       //тут похраним индексы минимумов
        int indexToPutMin = 0;                          //индексы для итерации
        int [] indexesOfMax = new int [countMax];       //тут похраним индексы максимумов
        int indexToPutMax = 0;
        for (int i = 0; i<array.length; i++){           //заполнение массивов с индексами мин и макс
            if (array[i]==min){
                indexesOfMin[indexToPutMin]=i;
                indexToPutMin++;
            }
            if (array[i]==max){
                indexesOfMax[indexToPutMax]=i;
                indexToPutMax++;
            }
        }
        System.out.print("Имеется массив  ");               //вывод всех трёх массивов
        System.out.println(Arrays.toString(array));
        System.out.println("Индексы минимумов: " + Arrays.toString(indexesOfMin));
        System.out.println("Индексы максимумов: " + Arrays.toString(indexesOfMax));
        if (indexesOfMax.length==1 && indexesOfMin.length==1 && (indexesOfMax[0]-indexesOfMin[0]==1 || indexesOfMax[0]-indexesOfMin[0]==-1)){                              //если мин и макс по одному и они соседи
                System.out.println("Между максимом и минимумом ничего нет, сумма 0");
        }
        else {                                                                              //если мин либо макс более одного
            int maxLenth = 0;           //тут будет храниться максимальная разница между индексами
            for (int ofMax : indexesOfMax) {                                    //внешний цикл перебирает индексы максимумов
                for (int i : indexesOfMin) {                                //внутренний - индексы минимумов
                    if (maxLenth < Math.abs(ofMax - i)) {                //если максразница меньше разницы между перибираемыми попарно индексами минмакс
                        maxLenth = Math.abs(ofMax - i);               //обновить максразницу
                        if (ofMax > i) {                               //а тут используем переменную для минимума и максимума не по назначению
                            max = ofMax;                                          //в min ложим минимальный индекс из пары с максразницей
                            min = i;                                          //в max - максимальный индекс из пары с максразницей
                        } else {
                            max = i;
                            min = ofMax;
                        }
                    }
                }
            }
            System.out.println("Подсчёт суммы элементов между индексами [" + min + "] и [" + max + "]...");
            int sum = 0;
            for (int i = min+1; i<max; i++){
                sum+=array[i];
            }
            System.out.println("Сумма элементов между максимально удалёнными максимом и минимумом равна " + sum);

        }
    }
}
