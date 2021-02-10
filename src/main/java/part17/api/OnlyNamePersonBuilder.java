package part17.api;

public class OnlyNamePersonBuilder extends PersonBuilder{
    @Override
    public Person createPerson(String[] info) {
        return new Person(info[0]);
    }
}
