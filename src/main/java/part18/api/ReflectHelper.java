package part18.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectHelper {

    public void printInfoAboutClassFieldsAndMethods (Class<Man> c){
        String className = c.getName();
        Field[]fields = c.getDeclaredFields();
        Method[]methods = c.getMethods();
        System.out.printf("Класс %s имеет следующие поля: \n", className);
        for (Field f : fields) System.out.println(f.getName());
        System.out.printf("Класс %s имеет следующие методы: \n", className);
        for (Method m : methods) System.out.println(m.getName());
    }

    public Method getMethod (String methodName, Class c) throws NoSuchMethodException {
        Method method = c.getMethod(methodName,null);
        return method;
    }

}
