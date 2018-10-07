package Package;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller extends Person{
    public Controller(String firstName, String secondName, String fatherSName, Date bDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstName = fatherSName;
        this.bDate = bDate;
    }

    public String toString(String formatDateOutput)
    {
        String resString = "\nИмя водителя: " + this.firstName;
        resString += "\nФамилия водителя: " + this.secondName;
        resString += "\nОтчество водителя: " + this.fatherSName;
        resString += "\nДата рождения: " + new SimpleDateFormat(formatDateOutput).format(this.bDate) + "\n";

        return resString;
    }

    public String toString()
    {
        return toString("dd MMM, yyyy");
    }
}
