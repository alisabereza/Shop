import java.util.Scanner;

public class Water extends Product {
    Water() {};

    Water(int id, String name, int number, String description, double price) {
        super(id, name, number, description, price);
    }

    @Override
    String show() {
        return "Water {" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", number=" + super.getNumber() +
                ", description='" + super.getDescription() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }

    static Water registerNewProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To add new Water, provide the following data:");
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

        return new Water(id, name, number, desc, price);
    }
}
