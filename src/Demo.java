import src.Order;
import src.Product;

import java.util.PriorityQueue;

public class Demo {
    public static void main(String[] args) {
        PriorityQueue<Order> oreders= new PriorityQueue<Order>(
                (a,b)->{
                    if(a.priority==b.priority)
                        return 0;
                    //Ako e 1 , shte ni vurne purvia element , ako e -1 ше ни върне втория елемент
                    if(a.priority>b.priority)
                        return 1;
                    else
                        return -1;

                }

        );
        Order orderOne=new Order(10);
        orderOne.addProduct(new Product("Water",1.5,3));
        orderOne.addProduct(new Product("Coffee",15.5,2));
        orderOne.addProduct(new Product("Flower",4.5,3));

        Order orderTwo=new Order(1);
        orderTwo.addProduct(new Product("Water",1.5,3));

        Order orderThree=new Order(5);
        orderThree.addProduct(new Product("Water",1.5,3));

        oreders.add(orderOne);
        oreders.add(orderTwo);
        oreders.add(orderThree);

        while (!oreders.isEmpty()){
            var order=oreders.poll();
            System.out.println("Order "+ order.priority);
            fullfillOrder(order);
            System.out.println("-".repeat(30));
//            System.out.println(order.priority);
        }

    }
        public static void fullfillOrder(Order order){
        var products=order.getProducts();
        for (int i=0;i<products.size();i++){
            System.out.printf("%s - %f - %d",products.get(i).name,products.get(i).price,products.get(i).quatity);
            System.out.println();
        }
        }

}
