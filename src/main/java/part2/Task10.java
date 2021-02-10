package part2;

public class Task10 {
    public static void main(String[] args) {
        int firstHouseLenth = 2;
        int firstHouseWidth = 2;
        int secondHouseLenth = 2;
        int secondHouseWidth = 2;
        int plotLenth = 3;
        int plotWidth = 2;

        System.out.println("Дома с размерами [" + firstHouseLenth + " на " + firstHouseWidth +
                "] и [" + secondHouseLenth + " на " + secondHouseWidth +
                "] можно разместить на участке размером [" + plotLenth + " на " + plotWidth + "]? ");
        if (canHousesBePlasedAtThePieceOfLand(firstHouseLenth, firstHouseWidth,
                secondHouseLenth, secondHouseWidth,
                plotLenth, plotWidth)) {
            System.out.println("Можно");
        } else {
            System.out.println("Не можно");
        }
    }
    public static boolean canHousesBePlasedAtThePieceOfLand (int firstHouseLenth,
                                                             int firstHouseWidth,
                                                             int secondHouseLenth,
                                                             int secondHouseWidth,
                                                             int plotLenth,
                                                             int plotWidth){
        if (firstHouseLenth*firstHouseWidth+secondHouseLenth*secondHouseWidth>plotLenth*plotWidth){             //если площадь не проходит
            return false;
        }
        else {
            if (firstHouseLenth+secondHouseLenth>plotLenth && firstHouseWidth+secondHouseWidth <= plotWidth){        //прямоугольники должны проходить хотя бы по одной координате
                return true;
            }
            else if (firstHouseLenth+secondHouseLenth>plotWidth && firstHouseWidth+secondHouseWidth <= plotLenth){
                return true;
            }
            else if (firstHouseWidth+secondHouseWidth>plotLenth && firstHouseLenth+secondHouseLenth <= plotWidth){
                return true;
            }
            else if (firstHouseWidth+secondHouseWidth>plotWidth && firstHouseLenth+secondHouseLenth <= plotLenth){
                return true;
            }
            else if (firstHouseLenth+secondHouseWidth>plotLenth && secondHouseLenth+firstHouseWidth <= plotWidth){
                return true;
            }
            else if (firstHouseLenth+secondHouseWidth>plotWidth && secondHouseLenth+firstHouseWidth <= plotLenth){
                return true;
            }
            else if (firstHouseWidth+secondHouseLenth>plotLenth && firstHouseLenth+secondHouseWidth <= plotWidth){
                return true;
            }
            else if (firstHouseWidth+secondHouseLenth>plotWidth && firstHouseLenth+secondHouseWidth <= plotLenth){
                return true;
            }
            else return false;
        }
    }
}
