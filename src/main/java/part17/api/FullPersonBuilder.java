package part17.api;

public class FullPersonBuilder extends PersonBuilder{
    @Override
    public Person createPerson(String[] info) {
        return new Person(info[0], info[1], Integer.parseInt(info[2]));
    }
}
