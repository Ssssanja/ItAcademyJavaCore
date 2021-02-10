package part14;

import part14.api.CallableInts;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task59 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CallableInts c = new CallableInts();

        for (int i = 0; i<10; i++){
            Future<String>future = executorService.submit(c);
        }
        executorService.shutdown();
    }
}
