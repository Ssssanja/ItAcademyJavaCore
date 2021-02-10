package part12;

import part12.api.WriteFileThread;

public class Task54 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 5; i++) {
            new WriteFileThread().start();
        }
    }
}
