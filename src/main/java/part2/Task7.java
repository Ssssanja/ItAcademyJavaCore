package part2;

public class Task7{
    public static void main(String[] args) {
        int rectangleA = 2;
        int rectangleB = 4;
        int circleRadius = 2;
        if (isCircleCloseRectangleHole(rectangleA,rectangleB, circleRadius)){
            System.out.println("Прямоугольное отверстие размером " + rectangleA + " на " + rectangleB + " можно полностью " +
                    "закрыть круглой картонкой радиусом " + circleRadius );
        }
        else {
            System.out.println("Прямоугольное отверстие размером " + rectangleA + " на " + rectangleB + " нельзя полностью " +
                    "закрыть круглой картонкой радиусом " + circleRadius );
        }
    }

    public static boolean isCircleCloseRectangleHole(int dlina, int visota, int radius){

        return (Math.sqrt(dlina*dlina + visota*visota)) <= radius*2; //диагональ<=диаметру
    }
}
