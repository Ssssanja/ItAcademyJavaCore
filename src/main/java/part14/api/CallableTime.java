package part14.api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class CallableTime implements Callable<String> {
    @Override
    public String call() throws Exception {
        File file = new File("./src/main/java/part14/api/resultsOfTask60.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss  ");
        String writableString = "Hello World " + sdf.format(new Date()) + "\n";
        writeStringInFile(file, writableString);
        System.out.println(Thread.currentThread().getName() + " начал работу");
        return writableString;
    }


    private synchronized void writeStringInFile(File f, String stringToWrote) throws IOException {
        FileWriter fileWriter;
        fileWriter = new FileWriter(f, true);
        fileWriter.write(stringToWrote);
        fileWriter.flush();
    }
}
