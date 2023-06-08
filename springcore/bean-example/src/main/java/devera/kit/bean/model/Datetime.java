package devera.kit.bean.model;

import java.beans.ConstructorProperties;

public class Datetime {
    public String year;
    public String month;
    public int date;

    @ConstructorProperties({ "year", "month", "date" })
    public Datetime(String year, String month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }
}
