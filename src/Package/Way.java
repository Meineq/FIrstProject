package Package;

import java.util.Date;

public class Way {
    private String FirsPoint;
    private String LastPoint;
    private double Cost;
    private Date Start;
    private Date Finish;
    private int countMachine;

   public Way(String FirsPoint, String LastPoint, double Cost, Date Start, Date Finish, int countMachine){
       this.FirsPoint = FirsPoint;
       this.LastPoint = LastPoint;
       this.Cost = Cost;
       this.Start = Start;
       this.Finish = Finish;
       this.countMachine = countMachine;
   }

    public String toString()
    {
        String resString = "\nНачальная отсановка: " + this.FirsPoint;
        resString += "\nКонечная отсановка: " + this.LastPoint;
        resString += "\nСтоимость проезда: " + this.Cost;
        resString += "\nВремя начала движения по маршруту: " + this.Start;
        resString += "\nВремя окончания движения по маршруту: " + this.Finish;
        resString += "\nКоличество техники на маршруте: " + this.countMachine + "\n";

        return resString;
    }
}
