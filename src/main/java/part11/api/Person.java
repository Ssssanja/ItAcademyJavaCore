package part11.api;

public class Person {
    private String name;
    private String Surname;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        Surname = surname;
        this.age = age;
    }
}
