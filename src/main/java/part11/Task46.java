package part11;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;


public class Task46 {
    public static void main(String[] args) throws IOException {
        File path = new File("./src/main/java");
        String[]list = path.list();
        LinkedHashSet<String> paths = new LinkedHashSet<>();
        LinkedHashSet<String>files = new LinkedHashSet<>();
        for (String s : list){
            String temp = path.getCanonicalPath() + "/" + s;
            File f = new File(temp);
            if (f.isDirectory()) paths.add(temp);
            if (f.isFile()) files.add(temp);
        }
        System.out.println("Список директорий, содержащихся в каталоге " + path.getName());
        for (String s : paths){
            System.out.println(s);
        }
        System.out.println("Список файлов, содержащихся в каталоге " + path.getName());
        for (String s : files){
            System.out.println(s);
        }

    }
}
