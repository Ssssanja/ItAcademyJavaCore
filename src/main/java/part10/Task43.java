package part10;



public class Task43 {
    public static void main(String[] args) {
        Integer i = null;
        try {
            System.out.println(i.toString());
        }
        catch (NullPointerException e){
            System.out.println(e.toString());
        }

    }
}
