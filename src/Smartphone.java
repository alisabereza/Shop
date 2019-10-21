import java.util.Scanner;

public class Smartphone extends Product {
    private int warranty;
    private TechSpecificationSmartphone tsSmartphone;

    Smartphone() {};

    Smartphone(int id, String name, int number, String description, double price, TechSpecificationSmartphone tsSmartphone, int warranty) {
        super(id, name, number, description, price);
        this.tsSmartphone = tsSmartphone;
        this.warranty = warranty;
    }

    int getWarranty() {
        return warranty;
    }

    void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    TechSpecificationSmartphone getTsSmartphone() {
        return tsSmartphone;
    }

    void setTsSmartphone(TechSpecificationSmartphone tsSmartphone) {
        this.tsSmartphone = tsSmartphone;
    }

    @Override
    String show() {
        return "Smartphone {" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", number=" + super.getNumber() +
                ", description='" + super.getDescription() + '\'' +
                ", price=" + super.getPrice() +
                ", tech specification=" + tsSmartphone.show() +
                ", warranty=" + warranty + '}';
    }

    static Smartphone registerNewProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To add new Smartphone, provide the following data:");
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
        System.out.println("Technical specification:");
        System.out.println("Memory volume (int)=");
        int memoryVolume = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Memory Type (String)=");
        String memoryType = scanner.next();
        scanner.nextLine();
        System.out.println("Processor:");
        System.out.println("Core number (int)=");
        int coreNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Frequency (int)=");
        int frequency = scanner.nextInt();
        scanner.nextLine();


        System.out.println("OS (String)=");
        String os = scanner.next();
        scanner.nextLine();
        System.out.println("Diagonal (double)=");
        double diagonal = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Time Of Working From Battery (doube)=");

        double timeOfWorkingFromBattery = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Warranty (years)=");
        int warranty = scanner.nextInt();
        return new Smartphone(id, name, number, desc, price, new TechSpecificationSmartphone(new Memory(memoryVolume, memoryType), new Processor(coreNumber, frequency), os, diagonal, timeOfWorkingFromBattery), warranty);
    }
}
