package part12.api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileThread extends Thread{

    @Override
    public void run() {
        try {
            createFileAndFill();
        } catch (IOException e) {
            System.out.println("Smth IOShit is happen");
            e.printStackTrace();
        }
    }

    private void createFileAndFill() throws IOException {
    String filename = "./src/main/java/part12/api/filesForThread/" + randomString() + ".txt";
    File file = new File(filename);
    boolean b = file.createNewFile();
    int[]array = makeRandomArrayOfInts();
    StringBuilder s = new StringBuilder();
    for (int i = 0; i<10; i++){
        s.append(array[i]).append(" ");
    }
    writeStringInFile(file, s.toString());
    }

    private void writeStringInFile(File f, String ints) throws IOException {
        FileWriter fileWriter;
        fileWriter = new FileWriter(f, false);
        fileWriter.write(ints);
        fileWriter.flush();
    }


    private String randomString() {
        char[]chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
        String result = "";
        for (int i = 0; i<8; i++){
            result+=chars[(int)(Math.random()*52)];
        }
        return result;
    }

    private int[] makeRandomArrayOfInts () {
        int[]array = new int[10];
        for (int i = 0; i<10; i++){
            array[i] = ((int) (Math.random() * 99) +1);
        }
        return array;
    }
}
