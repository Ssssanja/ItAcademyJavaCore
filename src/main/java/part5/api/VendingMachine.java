package part5.api;

import java.io.IOException;

public interface VendingMachine {
    public void load() throws IOException;
    public void withdraw() throws IOException;
    public void printEnableToWithdraw();
}
