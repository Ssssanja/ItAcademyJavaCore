package part_extra3.api.entities;
import java.util.List;

public class Person {
    private String name;
    private String title;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Restriction> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
    }

    private List<Restriction>restrictions;

    @Override
    public String toString() {
        String restrictions = getRestrictions()==null? "null" : getRestrictions().toString();
        return "Person{\n" +
                "\t\t\tname='" + name + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                ", restrictions: " + restrictions +
                "\n\t\t}";
    }
}
