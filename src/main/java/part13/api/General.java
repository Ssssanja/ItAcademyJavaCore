package part13.api;

import java.util.LinkedList;
import java.util.Queue;

public class General {
    private int count = 0;
    private Queue<Integer>queue = new LinkedList<>();

    public int getCount() {
        return count;
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void process () throws InterruptedException {
        for (int i = 0; i<3; i++){
            new Producer(this).start();
        }
        for (int i = 0; i<2; i++){
            new Consumer(this).start();
        }
    }
}
