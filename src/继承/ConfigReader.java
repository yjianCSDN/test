package 继承;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;

/**
 * @Author
 * @Date
 */
public class ConfigReader {
    public static String getclassName() {
        try {
                SAXReader reader = new SAXReader();
                InputStream in = Class.forName("ConfigReader").getResourceAsStream("/config.xml");
                Document document = reader.read(in);
                Node node = document.selectSingleNode("/animals/animal");
                String className = node.getStringValue();
                return className;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (DocumentException e) {
                e.printStackTrace();
            }
            return "";
        }
    }




