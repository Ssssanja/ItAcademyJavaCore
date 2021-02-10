package part9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Task42 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите с клавиатуры текст");
        Map<String, Integer>wordsMap = new HashMap<>();
        try {
            String text = reader.readLine();
            String [] words = text.replaceAll("[.,;:!?\\-]", " ").trim().split(" +");
            for (String s : words){
                int count = 0;
                for (String x : words){
                    if (s.equalsIgnoreCase(x)) count++;
                }
                wordsMap.put(s.toLowerCase(Locale.ROOT), count);
            }
            System.out.println("В ведённом тексте содержится слов: ");
            for (Map.Entry<String, Integer> entry : wordsMap.entrySet()){
                System.out.printf("Слово %s встречается раз: %d\n", entry.getKey(), entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
