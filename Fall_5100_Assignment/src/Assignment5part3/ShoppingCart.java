package Assignment5part3;
import java.util.*;
public class ShoppingCart {

    private List<Item> items;
    private int sum;

     public ShoppingCart(){
         items = new ArrayList<>();
     }


     public void addItem(Item item){
         items.add(item);

     }

     public void removeItem(Item item){
         items.remove(item);
     }

     public int calculateTotal(){
         sum  = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
     }

     public void pay(PaymentStrategy shoppingCart){
         calculateTotal();
         shoppingCart.pay(sum);

     }

}
