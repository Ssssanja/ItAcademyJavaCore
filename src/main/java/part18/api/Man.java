package part18.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Man {
    private final String name = "Tomas";
    private final String lastName = "Hanks";
    private int age = 65;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void printInfo () {
        System.out.printf("%s, %s, %d years old\n", name, lastName, age);
    }

}
