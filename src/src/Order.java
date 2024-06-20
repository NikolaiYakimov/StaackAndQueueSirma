package src;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public int priority;

    private ArrayList<Product> products;

    public Order(int priority) {
        this.priority = priority;
        this.products = new ArrayList<>();
    }

    public double getTotalPrice(){
        double total=0;
        for (int i = 0; i < products.size(); i++) {
            total+=products.get(i).price*products.get(i).quatity;
        }
        return total;
    }

    public void addProduct(Product product){
        if (product!=null){
            this.products.add(product);
        }
    }

    public ArrayList<Product> getProducts(){
        return this.products;
    }
}
