package part5;

import part5.api.Atm;

import java.io.IOException;

public class Task25 {
    public static void main(String[] args) throws IOException {
        Atm atm = new Atm();
        atm.load();
        atm.printEnableToWithdraw();
        atm.withdraw();
        atm.printEnableToWithdraw();
    }
}
