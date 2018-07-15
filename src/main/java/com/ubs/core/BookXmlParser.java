package com.ubs.core;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class BookXmlParser {

        public void  doParse() throws ParserConfigurationException, SAXException, IOException {

            String filename = "books.xml";
            File file = new File(BookXmlParser.class.getClassLoader().getResource(filename).getFile());

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("book");
            System.out.println("-----------------------------------");
            for (int i =0; i < nList.getLength(); i++){

                Node node = nList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    System.out.println("Node Name:  " + element.getNodeName());
                    System.out.println("Author Name:  " + element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("title      :  " + element.getElementsByTagName("title").item(0).getTextContent());

                    System.out.println("-----------------------------------");
                    System.out.println("");
                    System.out.println("");
                }

            }


        }

    public static void main(String[] args) {

            BookXmlParser bk = new BookXmlParser();

            try{
                bk.doParse();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }



}
