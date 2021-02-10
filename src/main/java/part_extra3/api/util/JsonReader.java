package part_extra3.api.util;

import java.io.*;

public class JsonReader {
    private File file;

    public JsonReader(File f) {
        this.file = f;
    }

    public String readFile () {
        String result = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            System.out.println("Читаем файл:");
            System.out.println(file.getCanonicalFile());
            StringBuilder sb = new StringBuilder();
            String s;
            while ((s = bufferedReader.readLine())!=null){
                sb.append(s);
            }
            result = sb.toString();
        }
        catch (FileNotFoundException e){
            System.out.println("File not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
