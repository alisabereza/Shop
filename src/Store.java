import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Computer> computers = new ArrayList<Computer>();
    private ArrayList<Smartphone> smartphones = new ArrayList<Smartphone>();
    private ArrayList<Vegetables> vegetables = new ArrayList<Vegetables>();
    private ArrayList<Sweets> sweets = new ArrayList<Sweets>();
    private ArrayList<Water> water = new ArrayList<Water>();
    private ArrayList<SweetDrinks> sweetDrinks = new ArrayList<SweetDrinks>();
    private ArrayList<Clothes> clothes = new ArrayList<Clothes>();
    private Double wallet = 0.0;


    void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    ArrayList<Computer> getComputers() {
        return computers;
    }

    ArrayList<Smartphone> getSmartphones() {
        return smartphones;
    }

    ArrayList<Vegetables> getVegetables() {
        return vegetables;
    }

    ArrayList<Sweets> getSweets() {
        return sweets;
    }

    ArrayList<Water> getWater() {
        return water;
    }

    ArrayList<SweetDrinks> getSweetDrinks() {
        return sweetDrinks;
    }

    ArrayList<Clothes> getClothes() {
        return clothes;
    }

    Double getWallet() {
        return wallet;
    }

    ArrayList findArrayListByCategory(String category) {
        ArrayList<? extends Product> productArrayList = new ArrayList<>();
        switch (category) {
            case "Smartphone": {
                productArrayList = smartphones;
                break;
            }
            case "Computer": {
                productArrayList = computers;

                break;
            }
            case "Vegetables": {
                productArrayList = vegetables;
                break;
            }
            case "Sweets": {
                productArrayList = sweets;
                break;
            }
            case "Water": {
                productArrayList = water;
                break;
            }
            case "SweetDrinks": {
                productArrayList = sweetDrinks;
                break;
            }
            case "Clothes": {
                productArrayList = clothes;
                break;
            }
            default: {
                System.out.println("There is no such category.");
                break;
            }
        }
        return productArrayList;
    }

    void addProductToStorage(Product product) {
        if (product instanceof Smartphone) {
            if (smartphones.contains(product)) {
                System.out.println("This product already exists in Storage: id=" + product.getId() + ", name=" + product.getName());
            } else {
                smartphones.add((Smartphone) product);
                System.out.println("The following smartphone was added to Storage: id=" + product.getId() + ", name=" + product.getName());
            }
        } else if (product instanceof Computer) {
            if (computers.contains(product)) {
                System.out.println("This product already exists in Storage: id=" + product.getId() + ", name=" + product.getName());
            } else {
                computers.add((Computer) product);
            }
            System.out.println("The following computer was added to Storage: id=" + product.getId() + ", name=" + product.getName());
        } else if (product instanceof Vegetables) {
            if (vegetables.contains(product)) {
                System.out.println("This product already exists in Storage: id=" + product.getId() + ", name=" + product.getName());
            } else {
                vegetables.add((Vegetables) product);
                System.out.println("The following vegetables were added to Storage: id=" + product.getId() + ", name=" + product.getName());
            }

        } else if (product instanceof Sweets) {
            if (sweets.contains(product)) {
                System.out.println("This product already exists in Storage: id=" + product.getId() + ", name=" + product.getName());
            } else {
                sweets.add((Sweets) product);
                System.out.println("The following sweets were added to Storage: id=" + product.getId() + ", name=" + product.getName());
            }
        } else if (product instanceof Water) {
            if (water.contains(product)) {
                System.out.println("This product already exists in Storage: id=" + product.getId() + ", name=" + product.getName());
            } else {
                water.add((Water) product);
            }

            System.out.println("The following water was added to Storage: id=" + product.getId() + ", name=" + product.getName());
        } else if (product instanceof SweetDrinks) {
            if (sweetDrinks.contains(product)) {
                System.out.println("This product already exists in Storage: id=" + product.getId() + ", name=" + product.getName());
            } else {
                sweetDrinks.add((SweetDrinks) product);
                System.out.println("The following sweet drink was added to Storage: id=" + product.getId() + ", name=" + product.getName());
            }
        } else if (product instanceof Clothes) {
            if (clothes.contains(product)) {
                System.out.println("This product already exists in Storage: id=" + product.getId() + ", name=" + product.getName());
            } else {
                clothes.add((Clothes) product);
                System.out.println("The following clothes were added to Storage: id=" + product.getId() + ", name=" + product.getName());
            }
        }
    }


    void findProductByName() {
        String category = Utils.getCategory(Utils.selectCategory());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        int j = -1;
        ArrayList<? extends Product> productArrayList = findArrayListByCategory(category);
        if (productArrayList.size() > 0) {
            boolean isInStore = false;
            for (int i = 0; i < productArrayList.size(); i++) {
                if (productArrayList.get(i).getName().contains(name)) {
                    j = i;
                    System.out.println("Product with the name=" + name + " found, id= " + productArrayList.get(i).getId() + " in Smartphone Storage.");
                    System.out.println("Full info: " + productArrayList.get(i).show());
                }
            }
        }

        if (j == -1) {
            System.out.println("Product with this name was not found :(");
        }
    }


    void delivery(String category, int id, int number) throws ParseException {

        ArrayList<? extends Product> productArrayList = new ArrayList<>();
        boolean isExistingCategory = true;

        switch (category) {
            case "Smartphone": {
                productArrayList = smartphones;
                break;
            }
            case "Computer": {
                productArrayList = computers;

                break;
            }
            case "Vegetables": {
                productArrayList = vegetables;
                break;
            }
            case "Sweets": {
                productArrayList = sweets;
                break;
            }
            case "Water": {
                productArrayList = water;
                break;
            }
            case "SweetDrinks": {
                productArrayList = sweetDrinks;
                break;
            }
            case "Clothes": {
                productArrayList = clothes;
                break;
            }
            default: {
                System.out.println("There is no such category.");
                isExistingCategory = false;
                break;


            }

        }
        if (isExistingCategory) {
            boolean isInStore = false;
            for (int i = 0; i < productArrayList.size(); i++) {
                if (productArrayList.get(i).getId() == id) {
                    productArrayList.get(i).takeDelivery(number);
                    System.out.println("Quantity of product " + productArrayList.get(i).getName() + " was changed. Now it is: " + productArrayList.get(i).getNumber());
                    isInStore = true;
                }

            }
            if (!isInStore) {
                System.out.println("There is no product with such id in Storage");
                System.out.println("Please register new product");
                addNewProduct();

            }

        }
    }

    void addNewProduct() throws ParseException {
        int category = Utils.selectCategory();
        switch (category) {
            case 1: {
                smartphones.add(Smartphone.registerNewProduct());
                break;
            }
            case 2: {
                computers.add(Computer.registerNewProduct());
                break;
            }
            case 3: {
                vegetables.add(Vegetables.registerNewProduct());
                break;
            }
            case 4: {
                sweets.add(Sweets.registerNewProduct());
                break;
            }
            case 5: {
                water.add(Water.registerNewProduct());
                break;
            }
            case 6: {
                sweetDrinks.add(SweetDrinks.registerNewProduct());
                break;
            }
            case 7: {
                clothes.add(Clothes.registerNewProduct());
                break;
            }
            default: {
                System.out.println("There is no such category");
            }
        }
        System.out.println("New product added.");
    }

    void sale(String category, int id, int number) {

        ArrayList<? extends Product> productArrayList = findArrayListByCategory(category);
        if (productArrayList.size() > 0) {
            boolean isInStore = false;
            for (int i = 0; i < productArrayList.size(); i++) {
                if (productArrayList.get(i).getId() == id) {
                    if (number > productArrayList.get(i).getNumber()) {
                        System.out.println("There is not enough amount on storage. Available amount is: " + productArrayList.get(i).getNumber());
                    } else {
                        System.out.println("The following quantity of id: " + productArrayList.get(i).getId() + ", " + productArrayList.get(i).getName() + " (" + productArrayList.get(i).getDescription() + ") was sold: " + number);
                        productArrayList.get(i).setNumber(productArrayList.get(i).getNumber() - number);
                        System.out.println("Current amount on storage is: " + productArrayList.get(i).getNumber());
                        wallet += productArrayList.get(i).getPrice() * number;
                    }
                    isInStore = true;
                }

            }
            if (!isInStore || productArrayList.size() == 0) {
                System.out.println("Nothing found");
            }

        }
    }

    void checkWalletState() {
        System.out.println(wallet.toString());
    }

}







