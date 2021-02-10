package part19;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import part19.api.JsonPerson;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task76 {
    public static void main(String[] args) throws IOException {
        System.out.println("Разбираем json файл \"./src/main/java/part19/api/jsonFile.txt\"");
        byte[]jsonData = Files.readAllBytes(Paths.get("./src/main/java/part19/api/jsonFile.txt"));
        ObjectMapper objectMapper = new ObjectMapper();
        JsonPerson jsonPerson = objectMapper.readValue(jsonData, JsonPerson.class);
        System.out.println("Десериализуем объект jsonPerson:");
        System.out.println("jsonPerson object " + jsonPerson);
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        StringWriter stringWriter = new StringWriter();
        objectMapper.writeValue(stringWriter, jsonPerson);
        System.out.println("Сериализуем наш объект:");
        System.out.println(stringWriter);
    }
}
