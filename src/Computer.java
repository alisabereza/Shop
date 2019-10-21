import java.util.Scanner;

public class Computer extends Product {

    private TechSpecificationPC techSpecificationPC;
    private int warranty;

    Computer() {};

    Computer(int id, String name, int number, String description, double price, TechSpecificationPC techSpecificationPC, int warranty) {
        super(id, name, number, description, price);
        this.techSpecificationPC = techSpecificationPC;
        this.warranty = warranty;
    }

    TechSpecificationPC getTechSpecificationPC() {
        return techSpecificationPC;
    }

    void setTechSpecificationPC(TechSpecificationPC techSpecificationPC) {
        this.techSpecificationPC = techSpecificationPC;
    }

    int getWarranty() {
        return warranty;
    }

    void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    String show() {
        return "Computer {" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", number=" + super.getNumber() +
                ", description='" + super.getDescription() + '\'' +
                ", price=" + super.getPrice() +
                ", tech specification=" + techSpecificationPC.show() +
                ", warranty=" + warranty + '}';
    }

    static Computer registerNewProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To add new Computer, provide the following data:");
        System.out.println("id=");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("name (String)=");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Number (int)=");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Description (String)=");
        String desc = scanner.next();
        scanner.nextLine();
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
        System.out.println("Graphics Card: ");
        System.out.println("Core number (int)=");
        int graphicsCoreNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Frequency (int)=");
        int graphicsFrequency = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Graphics memory:");
        System.out.println("Memory volume (int)=");
        int graphicsmemoryVolume = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Memory Type (String)=");
        String graphicsMemoryType = scanner.next();
        scanner.nextLine();
        System.out.println("Warranty (years)=");
        int warranty = scanner.nextInt();
        Computer computer = new Computer(id, name, number, desc, price, new TechSpecificationPC(new Memory(memoryVolume, memoryType), new Processor(coreNumber, frequency), new GraphicsCard(graphicsCoreNumber, graphicsFrequency, new GraphicsMemory(graphicsmemoryVolume, graphicsMemoryType))), warranty);
        System.out.println(computer.show());
        return computer;
    }
}