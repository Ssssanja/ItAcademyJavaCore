package part11;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task48 {
    public static void main(String[] args) {
        File file = new File("./src/main/java/part11/api/TextPlusNumbers.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));){
            System.out.println("Читаем файл:");
            System.out.println(file.getCanonicalFile());
            StringBuilder sb = new StringBuilder();
            String s;
            while ((s = bufferedReader.readLine())!=null){
                sb.append(s);
            }
            String [] numbersInStrings = sb.toString().replaceAll("[.,;:!?\\-\\—а-яА-Яa-zA-Z]",
                    " ").trim().split(" +");
            int [] ints = new int[numbersInStrings.length];
            int sum = 0;
            for (int i = 0; i<numbersInStrings.length; i++){
                ints[i] = Integer.parseInt(numbersInStrings[i]);
                sum+=ints[i];
            }
            System.out.println("В нём есть числа: ");
            for (int i : ints){
                System.out.println(i);
            }
            System.out.println("Их сумма равна " + sum);
            System.out.println("Убираем повторы...");
            LinkedHashSet<Integer>set = new LinkedHashSet<>();
            for (int i : ints){
                set.add(i);
            }
            System.out.println("Снова наши числа:");
            for (int i : set){
                System.out.println(i);
            }


        }
        catch (FileNotFoundException e){
            System.out.println("File not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
