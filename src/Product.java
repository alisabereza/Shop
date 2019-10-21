class Product {
    private int id;
    private String name;
    private int number;
    private String description;
    private double price;

    Product() {
    }

    ;

    Product(int id, String name, int number, String description, double price) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.description = description;
        this.price = price;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String show() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    void takeDelivery(int number) {
        System.out.println("The following quantity of id: " + id + ", " + name + " (" + description + ") was delivered: " + number);
        this.number += number;
        System.out.println("Current amount on storage is: " + this.number);
    }

    void sale(int n) {
        if (n > this.number) {
            System.out.println("There is not enough amount on storage. Available amount is: " + this.number);
        } else {
            System.out.println("The following quantity of id: " + id + ", " + name + " (" + description + ") was sold: " + n);
            this.number -= n;
            System.out.println("Current amount on storage is: " + this.number);
        }
    }

}