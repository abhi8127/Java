package reader;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import to.EmpInfo;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlFileParser implements IFileReader{


    @Override
    public List<EmpInfo> fileParser(String path, String filename) {
        String fullPath=path+"\\"+filename;
        //System.out.println(fullPath);
        List<EmpInfo> empInfoList = new ArrayList<EmpInfo>();
        try {
            File inputFile = new File(fullPath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");


            for (int temp = 0; temp < nList.getLength(); temp++) {
                EmpInfo empInfo = new EmpInfo();
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    empInfo.setRollNo(Integer.parseInt(eElement.getElementsByTagName("rollno").item(0).getTextContent()));
                    empInfo.setFirstName(eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    empInfo.setLastName(eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    empInfo.setNickName(eElement.getElementsByTagName("nickname").item(0).getTextContent());
                    empInfo.setMarks(Integer.parseInt(eElement.getElementsByTagName("marks").item(0).getTextContent()));
                    empInfo.setFileName(filename);
                    empInfo.setFileType("xml");


                }
                empInfoList.add(empInfo);
            }
            //empInfoList.setStudents(empInfoList);
            System.out.println("studentRecord : size := "+ empInfoList.size());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return empInfoList;
    }

}


