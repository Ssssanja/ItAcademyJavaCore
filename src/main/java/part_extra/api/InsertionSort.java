package part_extra.api;

public class InsertionSort extends Sort{
    private String name = "Сортировка вставками";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public  void sort(int[]array){
        for (int i = 1; i < array.length; i++) {                                        //перебор массива для сортировки вставками
            int newElement = array[i];                                                  //рассматриваемый элемент
            int index = binarySearch(array,newElement, 0, i);                    //ищем куда переместить рассматриваемый элемент с помощью бинарного поиска
            if (index < 0) {                                                            //если индекс <0
                index = -(index) - 1;                                                   //реверс знака и отнять единичку
            }
            System.arraycopy(array, index, array, index + 1, i - index); //сдвиг с помощью системного метода, он переносит сразу пачками, поэтому быстрее
            array[index] = newElement;                                                  //вставка
        }
        }
    public static int binarySearch ( int[] array, int keyToSearchPositionFor, int lowest, int highest){
        int low = lowest;                               //наименьший индекс для поиска
        int high = highest - 1;                         //наибольший

        while (low <= high) {                           //пока наименьший не достиг наибольшего
            int mid = (low + high) / 2;                 //средний индекс
            int midVal = array[mid];                    //среднее значение
            if (midVal < keyToSearchPositionFor)        //если среднее значение меньше искомого
                low = mid + 1;                          //наименьший = средний + 1 (исключить левую часть)
            else if (midVal > keyToSearchPositionFor)   //иначе если среднее значение больше искомого
                high = mid - 1;                         //наибольший = средний -1 (исключить правую часть)
            else                                        //иначе
                return mid;                             //вернуть индекс искомого
        }
        return -(low + 1);                              //если нет искомого - вернуть -(наименьший+1)
    }
}
