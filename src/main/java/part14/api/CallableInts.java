package part14.api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CallableInts implements Callable <String> {
    @Override
    public String call() throws Exception {
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i<10; i++){
            list.add((int)(Math.random()*25) + 1);
        }
        int sleeptime =((int)(Math.random()*3) + 1)*1000;
        System.out.println(Thread.currentThread().getName() + " создаёт 10 целых случайных чисел:\n" + list.toString() +
         "  и ложится спать на " + sleeptime/1000 + " сек.\n");
        Thread.sleep(sleeptime);
        return list.toString();
    }
}
