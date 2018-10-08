package Package;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;


public class ParserMinxFile extends Parser {


    protected ParserMinxFile(File file) {
        super(file);
    }

    public boolean doParse(Transport transport) throws FileNotFoundException, ParseException {
        Scanner scaner = new Scanner(file);
        scaner.useDelimiter("><");
        boolean isAtribute = false;
        String[] Classes = {"Machine", "Voditel", "Controller", "Way"};
        String[] ClassesAssociative = {"Техника", "Водитель", "Контролёр", "Маршрут"};
        ArrayList<String> classAtributes = new ArrayList<>();
        while(scaner.hasNext()){
            String str = scaner.next().trim();
            int startClassInd, endClassInd;
            boolean isAtributeTmp = isAtribute;

            for (int i=0;i<Classes.length;i++){
                startClassInd = str.indexOf(ClassesAssociative[i]);
                endClassInd = str.indexOf("/" + ClassesAssociative[i]);
                int slash = str.indexOf("/");
                if (startClassInd !=-1 && slash !=0){
                    isAtribute = true;
                    break;
                }

                if (endClassInd !=-1){
                    isAtribute = false;
                    switch(Classes[i]) {
                        case "Machine":
                            if (transport.addMachine(classAtributes)){
                                //System.out.println("Единица техники добавлена");
                            }
                            break;
                        case "Voditel" :
                            if (transport.addVoditel(classAtributes)){
                                //System.out.println("Водитель добавлен");
                            }
                            break;
                        case "Controller" :
                            if (transport.addController(classAtributes)){
                                //System.out.println("Контролёр добавлен");
                            }
                            break;
                        case "Way" :
                            if (transport.addWay(classAtributes)){
                                //System.out.println("Маршрут добавлен");
                            }
                    }
                    classAtributes.clear();
                    break;
                }
            }
            if (isAtribute && isAtributeTmp){
                String substring = str.substring(str.indexOf(">")+1, str.lastIndexOf("</"));
                classAtributes.add(substring);
            }
        }
        return true;
    }
}
