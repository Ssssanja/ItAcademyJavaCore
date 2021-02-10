package part17;

import part17.api.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task68 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные (возраст - цифрами) требуемой персоны через пробел, варианты:\nимя \nимя фамилия \nимя фамилия возраст");
        String input = "";
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[]info = input.trim().split(" +");
        PersonBuilder builder = null;
        if (info.length==1){
            builder = new OnlyNamePersonBuilder();
        }else if (info.length==2){
            builder = new WithoutAgePersonBuilder();
        }else if (info.length==3){
            builder = new FullPersonBuilder();
        }

        Person person = builder.createPerson(info);
        person.printPersonInfo();
    }
}
