package part6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        System.out.println(findHexadecimal(s));

    }

    public static String findHexadecimal(String s){
        StringBuffer sBuffer = new StringBuffer();
        String [] words = s.replaceAll("[.,;:!?\\-]", " ").trim().split(" +");
        for (int i = 0; i< words.length; i++){
            Pattern pattern = Pattern.compile("\\d[xX][0-9a-fA-F]+");
            Matcher matcher = pattern.matcher(words[i]);
            if (matcher.matches()){
                sBuffer.append(words[i]).append(" ");
            }

        }
        return sBuffer.toString().trim();
    }
}
