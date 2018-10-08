package Package;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller extends Person{
    public Controller(String firstName, String secondName, String fatherSName, Date bDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherSName = fatherSName;
        this.bDate = bDate;
    }

    public String toString(String formatDateOutput)
    {
        String resString = "\nИмя кондуктора: " + this.firstName;
        resString += "\nФамилия кондуктора: " + this.secondName;
        resString += "\nОтчество кондуктора: " + this.fatherSName;
        resString += "\nДата рождения: " + new SimpleDateFormat(formatDateOutput).format(this.bDate) + "\n";

        return resString;
    }

    public String toString()
    {
        return toString("dd MMM, yyyy");
    }
}
