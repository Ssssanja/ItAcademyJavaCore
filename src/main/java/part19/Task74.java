package part19;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Task74 {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        Document document = null;

        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File file = new File("./src/main/java/part19/api/Points.xml");
        try {
            document = documentBuilder.parse(file);
            Element root = document.getDocumentElement();
            System.out.println("Список точек:");
            NodeList nodeList = root.getChildNodes();
            for (int i = 0; i<nodeList.getLength(); i++){
                StringBuffer sb = new StringBuffer("Точка: ");
                if (nodeList.item(i) instanceof Element) {
                    NodeList nList = nodeList.item(i).getChildNodes();
                    for (int j = 0; j< nList.getLength(); j++){
                        if (nList.item(j) instanceof Element) {
                            NodeList childNodes = nList.item(j).getChildNodes();
                            for (int z = 0; z< childNodes.getLength(); z++){
                                sb.append(childNodes.item(z).toString().charAt(8));
                                sb.append("px,");
                            }
                        }
                    }
                    sb.deleteCharAt(sb.length()-1);
                    System.out.println(sb);
                }
            }

        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }


    }
}
