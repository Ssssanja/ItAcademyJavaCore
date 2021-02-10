package part11;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task47 {
    public static void main(String[] args) {
        File file = new File("./src/main/java/part11/api/Text.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));){
            System.out.println("Читаем файл:");
            System.out.println(file.getCanonicalFile());
            StringBuilder sb = new StringBuilder();
            String s;
            while ((s = bufferedReader.readLine())!=null){
                sb.append(s);
            }
            String [] words = sb.toString().replaceAll("[.,;:!?\\-]", " ").trim().split(" +");
            String [] znaki = sb.toString().replaceAll("[а-яА-Яa-zA-Z0-9]", " ").trim().split(" +");
            System.out.println("В этом файле:");
            System.out.println("Количество слов - " + words.length);
            System.out.println("Количество знаков препинания - " + znaki.length);
        }
        catch (FileNotFoundException e){
            System.out.println("File not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
