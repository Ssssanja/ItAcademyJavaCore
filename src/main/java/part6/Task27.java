package part6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task27 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        String [] words = s.trim().split(" +");
        System.out.println("Количество слов в ведённой строке - " + words.length);
    }
}
