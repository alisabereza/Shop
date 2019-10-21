import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void menuOptions() {
        System.out.println("Select action: ");
        System.out.println("0 - to shutdown ");
        System.out.println("1 - to find product by name");
        System.out.println("2 - to add product to Storage");
        System.out.println("3 - to sale product");
        System.out.println("4 - to check wallet state");
        System.out.println("5 - send email to users");
        System.out.println("6 - to add new user to Subscription Manager");
        System.out.println("7 - to print a list of available actions");
    }

    public static void main(String[] args) throws ParseException {
        Smartphone iphone = new Smartphone(5, "iphone 5s", 4, "This is Sasha's iphone", 40000, new TechSpecificationSmartphone(new Memory(450, "DDR5"), new Processor(5, 230), "iOS", 12, 24), 5);
        Smartphone galaxy = new Smartphone(3, "samsung galaxy", 5, "Galaxy", 30000, new TechSpecificationSmartphone(new Memory(550, "DDR5"), new Processor(5, 230), "Android", 10, 24), 5);
        Smartphone honor = new Smartphone(2, "Honor 5303", 6, "Honor", 20000, new TechSpecificationSmartphone(new Memory(350, "DDR4"), new Processor(4, 200), "Android", 8, 48), 3);

        Computer computer = new Computer(6, "Lenovo", 1, "Home Laptop", 20000, new TechSpecificationPC(new Memory(32000, "DDR5"), new Processor(8, 1200), new GraphicsCard(6, 470, new GraphicsMemory(16000, "DDR4"))), 10);
        Vegetables apples = new Vegetables(45333, "Apples", 329657, "Made in China", 22, "Macintosh", new ExpirationDate(Utils.setDate(2019, 11, 2, 3, 5, 7), 15, 2));
        System.out.println(apples.show());
        Sweets chocolate = new Sweets(33, "Roshen", 78650, "chocolate Roshen", 25, new ExpirationDate(Utils.setDate(2019, 11, 2, 3, 5, 7), 13, 6));
        ;
        Water clearWater = new Water(2, "Clear Water", 90221, "Non-carbonated", 13);
        SweetDrinks pepsi = new SweetDrinks(10, "Pepsi-Cola", 43667, "With Cherry", 18, new ExpirationDate(Utils.setDate(2019, 11, 2, 3, 5, 7), 20, 24));
        Clothes jumper = new Clothes(13, "Winter jumper", 32420, "Wool", 1200, new Brand(2015, "New Style", 50, 3));
        Store store1 = new Store();
        store1.addProductToStorage(apples);
        store1.addProductToStorage(iphone);
        store1.addProductToStorage(galaxy);
        store1.addProductToStorage(honor);
        store1.addProductToStorage(computer);
        store1.addProductToStorage(apples);
        store1.addProductToStorage(chocolate);
        store1.addProductToStorage(clearWater);
        store1.addProductToStorage(pepsi);
        store1.addProductToStorage(jumper);
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        ArrayList<User> users = subscriptionManager.getUsers();
        try {
            users.add(new User(1, "Sasha", "alisabereza@gmail.com", Utils.stringToDate("010119"), true));
            users.add(new User(2, "Serezha", "sergiy.shutko@gmail.com", Utils.stringToDate("020119"), true));
            users.add(new User(3, "Lera", "alisa.bereza@mail.ru", Utils.stringToDate("100919"), true));
            users.add(new User(4, "Orest", "alisa.bereza@mail.ru", Utils.stringToDate("211019"), false));
            users.add(new User(5, "Maria", "alisa.bereza@mail.ru", Utils.stringToDate("121219"), false));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        menuOptions();
        while (!exit) {
            System.out.println("\nEnter action (7 - to show available actions)");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0: {
                    System.out.println("\nShutting down...");
                    exit = true;
                    break;
                }
                case 1: {
                    store1.findProductByName();
                    break;
                }
                case 2: {
                    System.out.println("\nSelect Category: ");
                    String category = Utils.getCategory(Utils.selectCategory());
                    System.out.println("\nProvide product id: ");
                    int id = scanner.nextInt();
                    System.out.println("\nProvide number to add: ");
                    int number = scanner.nextInt();
                    store1.delivery(category, id, number);
                    break;
                }
                case 3: {
                    System.out.println("\nSelect Category: ");
                    String category = Utils.getCategory(Utils.selectCategory());
                    System.out.println("\nProvide product id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("\nProvide number to sale: ");
                    int number = scanner.nextInt();
                    store1.sale(category, id, number);
                    break;
                }
                case 4: {

                    store1.checkWalletState();
                    break;
                }
                case 5: {
                    scanner.nextLine();
                    System.out.println("Type mail subject: ");
                    String subject = scanner.nextLine();
                    System.out.println("Type mail message: ");
                    String message = scanner.nextLine();
                    subscriptionManager.sendMessage(subject, message);
                    System.out.println("Mails sent");
                    break;
                }
                case 6: {
                    subscriptionManager.addUser();
                    break;
                }
                case 7: {
                    menuOptions();
                    break;
                }
            }
        }


    }


}