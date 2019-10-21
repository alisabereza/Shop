import java.util.Scanner;

public class Clothes extends Product {
    private Brand brand;

    Clothes() {
    };

    Clothes(int id, String name, int number, String description, double price, Brand brand) {
        super(id, name, number, description, price);
        this.brand = brand;
    }

    Brand getBrand() {
        return brand;
    }

    void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    String show() {
        return "Clother {" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", number=" + super.getNumber() +
                ", description='" + super.getDescription() + '\'' +
                ", price=" + super.getPrice() +
                ", brand=" + brand.show() +
                '}';
    }

    static Clothes registerNewProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To add new Clothes, provide the following data:");
        System.out.println("id=");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("name (String)=");
        String name = scanner.nextLine();
        System.out.println("Number (int)=");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Description (String)=");
        String desc = scanner.nextLine();

        System.out.println("Price (double)=");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Brand:");
        System.out.println("Year (int): ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name (String): ");
        String bName = scanner.nextLine();

        System.out.println("Number of employees=");
        int numberOfEmployees = scanner.nextInt();

        System.out.println("Number of Countries=");
        int numberOfCountries = scanner.nextInt();


        return new Clothes(id, name, number, desc, price, new Brand(year, bName, numberOfEmployees, numberOfCountries));
    }
}
