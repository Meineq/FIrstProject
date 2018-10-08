package Package;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Transport {

    private LinkedList<Machine> machinesList = new LinkedList<Machine>();
    private LinkedList<Voditel> voditelsList = new LinkedList<Voditel>();
    private LinkedList<Controller> controllerList = new LinkedList<Controller>();
    private LinkedList<Way> waysList = new LinkedList<Way>();

    public boolean addMachine (ArrayList<String> classAtributes){
        Machine machine = new Machine(
                classAtributes.get(0),
                classAtributes.get(1),
                classAtributes.get(2),
                Integer.parseInt(classAtributes.get(3))
        );
        machinesList.add(machine);
        return true;
    }

    public boolean addVoditel (ArrayList<String> classAtributes) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-dd-mm").parse(classAtributes.get(3)),
                dateGetUdost =  new SimpleDateFormat("yyyy-dd-mm").parse(classAtributes.get(4)) ;
        Voditel voditel = new Voditel(
                classAtributes.get(0),
                classAtributes.get(1),
                classAtributes.get(2),
                date,
                dateGetUdost,
                classAtributes.get(5),
                classAtributes.get(6)
        );
        voditelsList.add(voditel);
        return true;
    }

    public boolean addController (ArrayList<String> classAtributes) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-dd-mm").parse(classAtributes.get(3));
        Controller controller = new Controller(
                classAtributes.get(0),
                classAtributes.get(1),
                classAtributes.get(2),
                date
        );
        controllerList.add(controller);
        return true;
    }

    public boolean addWay (ArrayList<String> classAtributes) throws ParseException {
        Date timeStart = new SimpleDateFormat("hh:mm:ss").parse(classAtributes.get(3)),
            timeEnd = new SimpleDateFormat("hh:mm:ss").parse(classAtributes.get(4));
        Way way = new Way(
                classAtributes.get(0),
                classAtributes.get(1),
                Double.parseDouble(classAtributes.get(2)),
                timeStart,
                timeEnd,
                Integer.parseInt(classAtributes.get(5))
        );
        waysList.add(way);
        return true;
    }

    public String getMachinesInfo()
    {
        String resString = "Всего техники: " + machinesList.size()+"\n";
//        int i = 1;
//        for (Machine machine: machinesList)
//        {
//            resString = resString.concat("---------------\nТехника №" + i + ":");
//            resString = resString.concat(machine.toString()+"---------------\n");
//            i++;
//        }
        return resString;
    }

    public String getVoditelssInfo()
    {
        String resString = "Всего водителей: " + voditelsList.size()+"\n";
//        int i = 1;
//        for (Voditel voditel: voditelsList)
//        {
//            resString = resString.concat("---------------\nВодитель №" + i + ":");
//            resString = resString.concat(voditel.toString()+"---------------\n");
//            i++;
//        }
        return resString;
    }

    public String getControllerssInfo()
    {
        String resString = "Всего кондукторов: " + controllerList.size()+"\n";
//        int i = 1;
//        for (Controller controller: controllerList)
//        {
//            resString = resString.concat("---------------\nКонтруктор №" + i + ":");
//            resString = resString.concat(controller.toString()+"---------------\n");
//            i++;
//        }
        return resString;
    }

    public String getWayssInfo()
    {
        String resString = "Всего маршрутов: " + waysList.size()+"\n";
//        int i = 1;
//        for (Way way: waysList)
//        {
//            resString = resString.concat("---------------\nМаршрут №" + i + ":");
//            resString = resString.concat(way.toString()+"---------------\n");
//            i++;
//        }
        return resString;
    }
}
