package part14;

import part14.api.CallableFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task58 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<List<String>>> futures = new ArrayList<>();
        CallableFiles c = new CallableFiles();
        for (int i = 0; i<10; i++){
            Future<List<String>>future = executorService.submit(c);
            futures.add(future);
        }
        executorService.shutdown();
    }
}
