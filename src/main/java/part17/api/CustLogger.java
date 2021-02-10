package part17.api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustLogger {
    private File file = new File("./src/main/java/part17/api/Data.txt");
    private static CustLogger instance;
    private CustLogger() {
    }

    public static CustLogger getInstance(){
        if (instance==null){
            instance = new CustLogger();
        }
        return instance;
    }

    public void log (String message){
        LocalDateTime dateTime = LocalDateTime.now();
        String info = dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss ---- ")) + message + "\n";
        try {
            writeStringInFile(file, info);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeStringInFile(File f, String ints) throws IOException {
        FileWriter fileWriter;
        fileWriter = new FileWriter(f, true);
        fileWriter.write(ints);
        fileWriter.flush();
    }


}
