import com.sun.beans.decoder.DocumentHandler;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.beans.XMLDecoder;
import java.util.Scanner;
public class Test {


    public static void XMLDecode_Deserialize(String path) throws Exception {
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        XMLDecoder xd = new XMLDecoder(bis);
        xd.readObject();
        xd.close();
    }


    public static void main(String[] args){
       //XMLDecode Deserialize Test


        while (true) {
        String path = "poc.xml";
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        try {
            if (a == 1) {
                XMLDecode_Deserialize(path);

//           File f = new File(path);
//           SAXParserFactory sf = SAXParserFactory.newInstance();
//           SAXParser sp = sf.newSAXParser();
//
//           DefaultHandler dh = new DefaultHandler();
//           DocumentHandler dh = new DocumentHandler();
//           sp.parse(f, dh);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }}

}