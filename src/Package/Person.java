package Package;

import java.util.Date;

public class Person {
    private String firstName;
    private String secondName;
    private String fatherSName;
    private Date bDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFatherSName() {
        return fatherSName;
    }

    public void setFatherSName(String fatherSName) {
        this.fatherSName = fatherSName;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }
}
