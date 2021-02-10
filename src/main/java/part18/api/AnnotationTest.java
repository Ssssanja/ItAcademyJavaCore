package part18.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AnnotationTest {

    @AcademyInfo(year = 2021)
    public void printDate(){
        System.out.println(LocalDate.now());
    }

    public void printDateTime(){
        System.out.println(LocalDateTime.now());
    }
}
