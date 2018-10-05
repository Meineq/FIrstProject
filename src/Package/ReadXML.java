package Package;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;

public class ReadXML {
    public static void main(String[] args) {

        Machine machine = new Machine();
        Voditel voditel = new Voditel();
        Controller controller = new Controller();
        Way way = new Way();
        Transport transport = new Transport();

        try(FileReader file = new FileReader("./files/XMLfromXSD.xml"); Scanner scaner = new Scanner(file))
        {
            while(scaner.hasNextLine()){
                System.out.println(FindElement(scaner.nextLine().trim(), machine, voditel, controller, way, transport));
            }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static String FindElement(String str, Machine machine, Voditel voditel, Controller controller, Way way, Transport transport) {
        int openTagStr = str.indexOf("<");
        int closeTagNameElem = str.indexOf(" ");
        String ClassName;
        try {
            if (!str.contains("</")) {

                if (str.contains("?")) {
                    return "Параметр";
                } else {
                    switch (str.substring(openTagStr + 1, closeTagNameElem)) {
                        case "Техника" : ClassName = "Machine";
                            break;

                        case "Водитель" : ClassName = "Voditel";
                            break;

                        case "Контролёр" : ClassName = "Controller";
                            break;

                        case "Маршрут" : ClassName = "Way";
                            break;

                        default: ClassName = "Transport";
                            break;
                    }
                    return "Объект класса: " + str.substring(openTagStr + 1, closeTagNameElem);
                }
            } else {
                if (str.contains("<")) {
                    if (str.indexOf("</") == 0) {
                        int openTagNameClass = str.indexOf("</");
                        int closeTagNameClass = str.indexOf(">");
                        return "Конец объекта класса " + str.substring(openTagNameClass+2,closeTagNameClass);
                    } else {
                        closeTagNameElem = str.indexOf(">");
                        int closeTagValueElem = str.indexOf("</");

                        return "\tАтрибут " + str.substring(openTagStr + 1, closeTagNameElem) + " : " + str.substring(
                                closeTagNameElem + 1, closeTagValueElem);
                    }
                } else {
                    return "";
                }
            }
        } catch(Exception ex){
            System.out.print(ex.getMessage());
        }
        return "";
    }
}
