import java.util.Date;
import java.util.Scanner;

public class Vegetables extends Product {
    private String sort;
    private ExpirationDate expDate;

    Vegetables() {
    }

    ;

    Vegetables(int id, String name, int number, String description, double price, String sort, ExpirationDate expDate) {
        super(id, name, number, description, price);
        this.sort = sort;
        this.expDate = expDate;
    }

    String getSort() {
        return sort;
    }

    void setSort(String sort) {
        this.sort = sort;
    }

    ExpirationDate getExpDate() {
        return expDate;
    }

    void setExpDate(ExpirationDate expDate) {
        this.expDate = expDate;
    }

    @Override
    String show() {
        return "Vegetables {" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", number=" + super.getNumber() +
                ", description='" + super.getDescription() + '\'' +
                ", price=" + super.getPrice() +
                ", sort=" + sort +
                ", expDate=" + expDate.show() + '}';
    }


    static Vegetables registerNewProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To add new Vegetables, provide the following data:");
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
        System.out.println("Sort (String):");
        String sort = scanner.nextLine();
        System.out.println("Expiration Date (in format DDMMYY): ");
        System.out.println("manufactureDate = ");
        Date manufactureDate = Utils.enterDate();
        System.out.println("temperature=");
        int temperature = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Shelf life=");
        int shelfLife = scanner.nextInt();

        return new Vegetables(id, name, number, desc, price, sort, new ExpirationDate(manufactureDate, temperature, shelfLife));
    }
}
