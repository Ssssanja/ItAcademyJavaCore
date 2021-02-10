package part14;

import part14.api.CallableFiles;
import part14.api.CallableInts;
import part14.api.CallableTime;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task60 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CallableTime c = new CallableTime();

        for (int i = 0; i<10; i++){
            Future<String> future = executorService.submit(c);
        }
        executorService.shutdown();
    }
}
