package part15.api;

public class Person {

    private String name;
    private String surName;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
        age = (int) (Math.random()*60 + 10);
    }

    public void printPersonInfo () {
        System.out.printf("%s, %s; Age: %d\n", name, surName, age);
    }
}
