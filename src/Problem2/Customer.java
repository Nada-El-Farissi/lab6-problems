package Problem2;
import java.util.ArrayList;


public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    Customer(String name){
        this.name=name;
        transactions=new ArrayList();
    }
    public String getName(){
        return name;
    }
    public void addTransaction(Double t){
        transactions.add(t);
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }

}
