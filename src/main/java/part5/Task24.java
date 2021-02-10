package part5;

import part5.api.PieceOfTime;

public class Task24 {
    public static void main(String[] args) {
        PieceOfTime pieceOfTime = new PieceOfTime(1,0,0);
        PieceOfTime pieceOfTime1 = new PieceOfTime(3600);
        pieceOfTime.print();
        pieceOfTime1.print();
        System.out.println("Сравним два промежутка через equals:");
        System.out.println(pieceOfTime.equals(pieceOfTime1));
        System.out.println("Сравним два промежутка через compareTo:");
        System.out.println(pieceOfTime.compareTo(pieceOfTime1)==0);
    }
}
