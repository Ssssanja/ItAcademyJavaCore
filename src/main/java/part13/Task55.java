package part13;

import part13.api.ThreadForSleep;

public class Task55 {
    public static void main(String[] args) {
        Object o = new Object();
        for (int i = 0; i<10; i++){
            ThreadForSleep t = new ThreadForSleep(o);
            t.start();
        }
    }
}
