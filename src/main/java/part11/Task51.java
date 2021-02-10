package part11;

import part11.api.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task51 {
    public static void main(String[] args) throws IOException {
        ArrayList<Person>persons = new ArrayList<>();
        for (int i = 0; i<10; i++){
            persons.add(createRandomPerson());
        }
        File file = new File("./src/main/java/part11/api/Persons.txt");
        boolean b = file.createNewFile();
        savePersonsInfo(persons, file);


    }

    private static void savePersonsInfo(List<Person>persons, File file) throws IOException {
        writeStringInFile(file, "List of persons:\n", false);
        for (Person p : persons){
           String s = String.format ("Person name: %s, person surname: %s, person age: %d\n", p.getName(), p.getSurname(), p.getAge());
           writeStringInFile(file, s, true);
        }

    }

    private static Person createRandomPerson () {
        return new Person(randomString(),randomString(),(int)(Math.random()*100)+1);
    }

    private static String randomString() {
        char[]chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
        String result = "";
        for (int i = 0; i<8; i++){
            result+=chars[(int)(Math.random()*52)];
        }
        return result;
    }

    private static void writeStringInFile(File f, String ints, boolean append) throws IOException {
        FileWriter fileWriter;
        fileWriter = new FileWriter(f, append);
        fileWriter.write(ints);
        fileWriter.flush();
    }
}
