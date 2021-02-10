package part18;


import part18.api.ClassWithHello;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task71 {
    public static void main(String[] args) {
        Class c = ClassWithHello.class;
        Method[]methods = c.getDeclaredMethods();
        Method m = methods[0];
        System.out.printf("Вызываем метод %s рефлексией: \n", m.getName());
        try {
            m.setAccessible(true);
            m.invoke(new ClassWithHello(), null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
