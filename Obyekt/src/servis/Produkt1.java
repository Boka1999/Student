package servis;

import model.Product;

public class Produkt1 {
    public static void main(String[] args) {
        ProductService product = new ProductService ();
        Product p1 = product.create("snicers", "chocolate", 200, 1456  );
        Product p2 = product.create("coca-cola", "drink", 800, 199  );
        Product p3 = product.create("paracetamol", "medicine", 100, 14676  );
        Product p4 = product.create("samsung", "telephone", 250000, 26  );
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
        Product[] product1 = new Product[] {p1, p2, p3, p4,};



        }



    }


