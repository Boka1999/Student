package model;

public class Product {
    String name;//anun
    String category;//kategoria
    int price;//gin
    int quantity; // qanak

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void printInfo () {
        System.out.println("name" + " " + name);
        System.out.println("category" + " " + category  );
        System.out.println("price" + " " + price );
        System.out.println("quantity" + " " + quantity);
        System.out.println("============================");
    }
}
