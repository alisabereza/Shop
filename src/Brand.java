public class Brand {
    private int year;
    private String name;
    private int numberOfEmployees;
    private int numberOfCountries;

    Brand(int year, String name, int numberOfEmployees, int numberOfCountries) {
        this.year = year;
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.numberOfCountries = numberOfCountries;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    int getNumberOfCountries() {
        return numberOfCountries;
    }

    void setNumberOfCountries(int numberOfCountries) {
        this.numberOfCountries = numberOfCountries;
    }

    String show() {
        return "{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", numberOfCountries=" + numberOfCountries +
                '}';
    }
}
