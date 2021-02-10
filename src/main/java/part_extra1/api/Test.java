package part_extra1.api;

public class Test {
    public static void main(String[] args) {

    }
    public static void minIndex(int[]array){
        int[]indexesOfMin = new int[3]; //это предположительно я знаю, что у меня 3 минимума в массиве array
        int index = 0;                  //это счётчик, который я буду использовать для указания, куда в этот массив ложить идекс минимума

        int min = minValue(array);
        for (int i = 0; i<array.length; i++){
            if (array[i]==min){
                indexesOfMin[index]=i;  //вот тут я складываю индексы минимумов в свой массив
                index++;                //а тут инкремент индекса, что бы по порядку ложить
            }
        }

    }

    private static int minValue(int[] array) {
        return 0;
    }
}
