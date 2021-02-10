package part15;

import part15.api.NamesFactory;
import part15.api.Person;
import part15.api.PersonFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task62 {
    public static void main(String[] args) {
        PersonFactory<Person> personPersonFactory = Person::new;
        NamesFactory namesFactory = new NamesFactory();
        Person person = personPersonFactory.create("Peter", "Parker");
        ArrayList<Person>persons = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            persons.add(personPersonFactory.create(namesFactory.getRandomName(), namesFactory.getRandomSurName()));
        }

        List<String> result = persons.stream()
                .filter(p -> p.getAge()<21)
                .peek( p -> p.printPersonInfo())
                .sorted(Comparator.comparing(Person::getSurName).thenComparing(Person::getName))
                .limit(4)
                .map(p -> p.getSurName())
                .collect(Collectors.toList());
        for (String x : result) System.out.println(x);
    }
}
