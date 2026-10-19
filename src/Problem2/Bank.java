package Problem2;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    Bank(String name){
        this.name=name;
        customers=new ArrayList();
    }
    public void add(Customer c){
        for (Customer cust:customers){
            if (cust.getName().equals(c.getName())){
                return;
            }
        }
        customers.add(c);
    }
    public void addTransaction(Customer c, Double t){
        for (Customer cust:customers){
            if (cust.getName().equals(c.getName())){
                c.addTransaction(t);
            }
        }

    }
    public void printStatement(String name){
        for (int i=0;i<customers.size();i++){
            if (name.equals(customers.get(i).getName())){
                System.out.print("Customer: "+name+", transaction amounts: ");
                for (int j = 0; j<customers.get(i).getTransactions().size(); j++) {
                    double amount=customers.get(i).getTransactions().get(j);//unboxing by assigning Double to a double
                    System.out.println(amount);
                }
            }
        }
    }


}
