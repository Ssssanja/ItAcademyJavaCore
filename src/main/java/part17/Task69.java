package part17;

import part17.api.CustLogger;

public class Task69 {
    public static void main(String[] args) {
        CustLogger logger = CustLogger.getInstance();
        int a = 6;
        int b = 0;
        try {
            System.out.println(a / b);
        }
        catch (Exception e) {
            logger.log(e.toString());
        }

        }
}
