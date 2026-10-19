package problem1;

public class Item {
    private String name;
    private double price;
    private int quantity;
    Item(String n,double p,int q){
        name=n;
        price=p;
        quantity=q;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getName(){
        return name;
    }
}
