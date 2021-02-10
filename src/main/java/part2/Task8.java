package part2;

public class Task8 {
    public static void main(String[] args) {
        int sum = 300;
        printSum(sum);
    }

    private static void printSum(int sum) {
        System.out.print("На счету " + sum + " ");
        if (sum %100==11|| sum %100==12|| sum %100==13|| sum %100==14) {
            System.out.println("рублей");
        }
        else {
            switch (sum % 10) {
                case 1:
                    System.out.print("рубль");
                    break;
                case 2:
                    System.out.print("рубля");
                    break;
                case 3:
                    System.out.print("рубля");
                    break;
                case 4:
                    System.out.print("рубля");
                    break;
                default:
                    System.out.print("рублей");
            }
        }
        System.out.println();
    }
}
