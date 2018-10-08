package Package;
import java.io.*;
import java.util.Locale;

public class ReadXML {
    public static void main(String[] args) {
        try {
            Transport tran = new Transport();
            ParserMinxFile parser = new ParserMinxFile(new File("./files/XMLfromXSDmin.xml"));
            parser.doParse(tran);
            System.out.println(tran.getMachinesInfo());
            System.out.println(tran.getVoditelssInfo());
            System.out.println(tran.getControllerssInfo());
            System.out.println(tran.getWayssInfo());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
