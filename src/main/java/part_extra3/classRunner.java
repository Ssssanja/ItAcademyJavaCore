package part_extra3;

import part_extra3.api.entities.JsonObject;
import part_extra3.api.util.Fabric;

import java.io.File;

public class classRunner {
    public static void main(String[] args) {
        File file = new File("src/main/java/part_extra3/api/extra_task.json");
        Fabric fabric = new Fabric(file);
        JsonObject jsonObject = fabric.create();
        System.out.println("Object created:" + jsonObject);
    }
}
