package part18;

import part18.api.Man;
import part18.api.ReflectHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Task70 {
    public static void main(String[] args) {
       ReflectHelper reflectHelper = new ReflectHelper();
       reflectHelper.printInfoAboutClassFieldsAndMethods(Man.class);
        try {
            System.out.println("Вызываем метод  рефлексией: ");
            Method m = reflectHelper.getMethod("printInfo", Man.class);
            m.invoke(new Man(), null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
