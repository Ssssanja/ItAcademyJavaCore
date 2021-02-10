package part6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task28 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        String [] words = s.replaceAll("[.,;:!?\\-]", " ").trim().split(" +");
        char[]lastSymbols = new char[words.length];
        for (int i = 0; i< words.length; i++){
            lastSymbols[i]=words[i].charAt(words[i].length()-1);
        }
        String result = new String(lastSymbols);
        System.out.println("Текст, составленный из последних букв слов из введённой строки: \n" + result);
    }
}
