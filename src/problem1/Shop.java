package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
            // *** create a new item and add it to the cart
            Item newItem=new Item(itemName,itemPrice,quantity);
            cart.add(newItem);
            //System.out.print(cart); //uses default toString of cart
            // *** print the contents of the cart object using println
            double total=0;
            for (int i=0; i<cart.size(); i++){
                System.out.println(String.format(
                        "item %d: %s, price: %.2f, quantity: %d",
                        i + 1,
                        cart.get(i).getName(),
                        cart.get(i).getPrice(),
                        cart.get(i).getQuantity()
                ));
                total+=cart.get(i).getPrice() * cart.get(i).getQuantity();
            }
            System.out.println("the total is:"+total);

            System.out.print ("\n Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
