package part6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        System.out.println(findTags(s));
    }

    public static String findTags(String s){
        StringBuffer sBuffer = new StringBuffer();
            Pattern pattern = Pattern.compile("<p\\s.*>");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()){
                sBuffer.append(matcher.group()).append("\n");
            }
        return sBuffer.toString();
    }

}
