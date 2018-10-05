package Package;

import java.util.Date;

public class Voditel extends Person {
    private Date dateGetUdost;
    private String categories;

    public Date getDateGetUdost() {
        return dateGetUdost;
    }

    public void setDateGetUdost(Date dateGetUdost) {
        this.dateGetUdost = dateGetUdost;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
}
