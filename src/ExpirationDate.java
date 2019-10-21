
import java.util.Date;

public class ExpirationDate {
    private Date manufactureDate;
    private int temperature;
    private int shelfLife;

    ExpirationDate(Date manufactureDate, int temperature, int shelfLife) {
        this.manufactureDate = manufactureDate;
        this.temperature = temperature;
        this.shelfLife = shelfLife;
    }

    Date getManufactureDate() {
        return manufactureDate;
    }

    void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    int getTemperature() {
        return temperature;
    }


    int getShelfLife() {
        return shelfLife;
    }

    void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    String show() {
        return "{" +
                "manufacture date=" + manufactureDate +
                ", temperature=" + temperature +
                ", shelf life=" + shelfLife +
                '}';
    }
}

