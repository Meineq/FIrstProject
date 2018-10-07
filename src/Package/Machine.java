package Package;

import java.text.SimpleDateFormat;

public class Machine {
    private String typeMachine;
    private  String number;
    private  String brand;
    private int countNumbers;


    public Machine(String typeMachine, String number, String brand, int countNumbers) {
        this.typeMachine = typeMachine;
        this.number = number;
        this.brand = brand;
        this.countNumbers = countNumbers;
    }
    public String toString()
    {
        String resString = "\nТип техники: " + this.typeMachine;
        resString += "\nНомер техники: " + this.number;
        resString += "\nМарка автомобиля: " + this.brand;
        resString += "\nВместительность пассажиров: " + this.countNumbers + "\n";

        return resString;
    }
}
