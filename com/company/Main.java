package com.company;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

class ReadCIMxml{


    public static void extractCIM(Node node, String param) {

    }
}

public class Main{
    public static void main(String[] args) {

        try {

            File XmlFile = new File("C:\\Users\\施云辉\\Desktop\\宏远变电站_宏远F2沿河站线.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(XmlFile);

// normalize CIM XML file
            doc.getDocumentElement().normalize();

            NodeList CNlist = doc.getElementsByTagName("cim:ConnectivityNode");
            // … read other required CIM objects(loads, analogs etc)

            // … cycle through each list to extract required data
            for (int i = 0; i < CNlist.getLength(); i++) {

// … remember to convert node to element in order to search for the data inside it. method element.getElementsByTagName("cim:IdentifiedObject.name").item(0) can be used

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
