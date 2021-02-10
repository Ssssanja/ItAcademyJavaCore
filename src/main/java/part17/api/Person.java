package part17.api;

public class Person {
    private String name;
    private String surName;
    private int age;

    public Person(String name) {
        this.name = name;
        this.surName = "unknown";
        this.age = 0;
    }

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
        this.age = 0;
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public void printPersonInfo(){
        System.out.printf("%s, %s, %d\n", name, surName, age);
    }
}
