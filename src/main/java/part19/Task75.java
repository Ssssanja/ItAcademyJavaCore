package part19;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task75 {
    public static void main(String[] args) {
        boolean isPoint = false;
        boolean isX = false;
        boolean isY = false;
        XMLInputFactory factory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("./src/main/java/part19/api/Points.xml"));
            System.out.println("Список точек:");
            while (reader.hasNext()){
                int res = reader.next();
                if (res == reader.START_ELEMENT){
                    if (reader.getLocalName().equals("point")){
                        isPoint = true;
                    }
                    else if (reader.getLocalName().equals("x")){
                        isX = true;
                    }
                    else if (reader.getLocalName().equals("y")){
                        isY = true;
                    }
                }
                else if (res==reader.CHARACTERS){
                    if (isPoint){
                        System.out.print(("Точка: "));
                        isPoint = false;
                    }
                    else if (isX){
                        System.out.print(reader.getText() + "px, ");
                        isX = false;
                    }
                    else if (isY){
                        System.out.println(reader.getText() + "px.");
                        isY = false;
                    }
                }
            }
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
