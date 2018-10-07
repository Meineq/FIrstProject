package Package;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Voditel extends Person {
    private Date dateGetUdost;
    private String categories;
    private String numberPassport;

    public Voditel(String firstName, String secondName, String fatherSName, Date bDate, Date dateGetUdost, String categories, String numberPassport) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherSName = fatherSName;
        this.bDate = bDate;
        this.dateGetUdost = dateGetUdost;
        this.categories = categories;
        this.numberPassport = numberPassport;
    }

    public String toString(String formatDateOutput)
    {
        String resString = "\nИмя водителя: " + this.firstName;
        resString += "\nФамилия водителя: " + this.secondName;
        resString += "\nОтчество водителя: " + this.fatherSName;
        resString += "\nДата рождения: " + new SimpleDateFormat(formatDateOutput).format(this.bDate);
        resString += "\nДата получения водительских прав: " + new SimpleDateFormat(formatDateOutput).format(this.dateGetUdost);
        resString += "\nКатегории водительских прав: " + this.categories;
        resString += "\nНомер водительских прав: " + this.numberPassport + "\n";

        return resString;
    }

    public String toString()
    {
        return toString("dd MMM, yyyy");
    }
}
