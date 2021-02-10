package part10;



public class Task45 {
    public static void main(String[] args) {
        process();
    }

    public static void process () {
        try {
            method();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");

        }
    }

    private static void method () throws NumberFormatException{
       String s = "abc";
       int x = Integer.parseInt(s);
    }
}
