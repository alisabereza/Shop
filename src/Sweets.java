import java.util.Date;
import java.util.Scanner;

public class Sweets extends Product {
    private ExpirationDate expDate;

    Sweets() {
    };

    Sweets(int id, String name, int number, String description, double price, ExpirationDate expDate) {
        super(id, name, number, description, price);
        this.expDate = expDate;
    }

    ExpirationDate getExpDate() {
        return expDate;
    }

    void setExpDate(ExpirationDate expDate) {
        this.expDate = expDate;
    }

    @Override
    String show() {
        return "Sweets {" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", number=" + super.getNumber() +
                ", description='" + super.getDescription() + '\'' +
                ", price=" + super.getPrice() +
                ", expDate=" + expDate.show() + '}';
    }

    static Sweets registerNewProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To add new Sweets, provide the following data:");
        System.out.println("id=");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("name (String)=");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Number (int)=");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Description (String)=");
        String desc = scanner.nextLine();
        System.out.println("Price (double)=");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Expiration Date (in format DDMMYY): ");
        System.out.println("manufactureDate = ");
        Date manufactureDate = Utils.enterDate();

        System.out.println("temperature=");
        int temperature = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Shelf life=");
        int shelfLife = scanner.nextInt();

        return new Sweets(id, name, number, desc, price, new ExpirationDate(manufactureDate, temperature, shelfLife));
    }
}
