package part17.api;

public class WithoutAgePersonBuilder extends PersonBuilder{
    @Override
    public Person createPerson(String[] info) {
        return new Person(info[0], info[1]);
    }
}
