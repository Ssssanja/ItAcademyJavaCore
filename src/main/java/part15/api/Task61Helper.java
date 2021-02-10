package part15.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Task61Helper {
    public void printEvenInches(Collection<Integer> collection){
        collection.stream()
                .filter(s->s%2==0)
                .peek(i-> System.out.println(i + " Дюймов"))
        .collect(Collectors.toList());
    }

    public void printEvenInchesToSantimeters (Collection<Integer> collection){
        collection.stream()
                .filter(s->s%2==0)
                .peek(d -> System.out.println( d + " Дюймов - это " + d*2.54 + " см"))
                .collect(Collectors.toList());
    }

    public void printSumOfEvenInchesInSantimetres(Collection<Integer>collection){
        List<Integer> list = collection.stream()
                .filter(s->s%2==0).
                        collect(Collectors.toList());
        System.out.println("Чётные дюймы: " + list);
        int sum = list.stream().reduce(Integer::sum).orElse(0);
        System.out.println("В сумме это " + sum + " Дюймов, или " + sum * 2.54 + " см");
    }
}
