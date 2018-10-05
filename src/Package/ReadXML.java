package Package;
import java.io.*;
import java.util.Scanner;

public class ReadXML {
    public static void main(String[] args) {


        try(FileReader file = new FileReader("./files/XMLfromXSD.xml"); Scanner scaner = new Scanner(file))
        {
            while(scaner.hasNextLine()){
                System.out.println(FindElement(scaner.nextLine().trim()));
            }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static String FindElement(String str) {
        if (str.indexOf("</") == -1){
            int openTagStr = str.indexOf("<");
            int closeTagNameElem = str.indexOf(" ");
            return str.substring(openTagStr+1,closeTagNameElem);
        }

        return "";
    }
}
