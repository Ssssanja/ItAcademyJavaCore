package part14.api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CallableFiles implements Callable<List<String>> {
    @Override
    public List<String> call() throws Exception {
        List<String>result = new ArrayList<>();
        for (int i = 0; i<10; i++){
            File file = new File("./src/main/java/part14/api/filesForCallable/Strings" + randomString(3) + ".txt");
            boolean b = file.createNewFile();
            for (int j = 0; j<10; j++){
                writeStringInFile(file, randomString(10));
            }
            result.add(file.getName());
        }
        int sleeptime = ((int)(Math.random()*3) + 1)*1000;
        System.out.println(Thread.currentThread().getName() + " Создаёт 10 файлов: " + result.toString());
        System.out.println(Thread.currentThread().getName() + " Ложится спать на " + sleeptime/1000 + " сек.");

        Thread.sleep(sleeptime);
        return result;
    }


    private String randomString(int lengthOfString) {
        char[]chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
        String result = "";
        for (int i = 0; i<lengthOfString; i++){
            result+=chars[(int)(Math.random()*52)];
        }
        return result;
    }

    private void writeStringInFile(File f, String stringToWrote) throws IOException {
        FileWriter fileWriter;
        fileWriter = new FileWriter(f, true);
        fileWriter.write(stringToWrote);
        fileWriter.flush();
    }
}
