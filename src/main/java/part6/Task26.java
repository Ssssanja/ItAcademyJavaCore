package part6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        Pattern pattern = Pattern.compile("[.,;:!?\\-]");
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Количество знаков препинания в ведённой строке - " + count);
    }
}
