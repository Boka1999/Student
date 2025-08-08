package servis;
import model.Product;
public class ProductService {

    public Product create(String name, String category, int price, int quantity) {
        Product product = new Product();
        product.setName(name);
        product.setCategory(category);
        product.setPrice(price);
        product.setQuantity(quantity);
        return product;

    }

}




