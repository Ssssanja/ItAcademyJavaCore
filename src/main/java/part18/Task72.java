package part18;

import part18.api.AcademyInfo;
import part18.api.AnnotationTest;
import part18.api.ClassWithHello;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Task72 {
    public static void main(String[] args) {
        Class c = AnnotationTest.class;
        Method[]methods = c.getDeclaredMethods();
        for (Method m : methods){
            Annotation anno = m.getAnnotation(AcademyInfo.class);
            System.out.printf("Проверяем метод %s рефлексией на наличие аннотации @AcademyInfo: \n", m.getName());
            if(anno==null) System.out.println("аннотации @AcademyInfo нет.");
            else {
                System.out.printf("У метода %s есть аннотация @AcademyInfo", m.getName());
            }
        }
    }
}
