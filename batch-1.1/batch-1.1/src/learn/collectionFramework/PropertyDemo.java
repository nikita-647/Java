package learn.collectionFramework;

import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyDemo {
  public static void main(String[] args) throws Exception {
    Properties p = new Properties();

    /*
     * p.setProperty("Brand","Dell");
     * p.setProperty("Processor","i5");
     * p.setProperty("OS","Windows11");
     * p.setProperty("Model","Latitude");
     * 
     * p.store(new FileOutputStream("C:/Users/Users/Desktop/MyData.txt"),
     * "Laptop Specification");
     * p.storeToXML(new FileOutputStream("C:/Users/Users/Desktop/MyData.xml"),
     * "Laptop Specification");
     */

    p.loadFromXML(new FileInputStream("C:/Users/Users/Desktop/MyData.xml"));
    System.out.println(p);
    System.out.println(p.getProperty("Name"));
  }
}