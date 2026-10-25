package Problem3;

public class Novel extends Book {
    public double price;
    Novel(String title, String author,int n,double p){
        super(title,author,n);
        this.price=p;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Novel Title: ").append(title).append(" numRec: ")
                .append(numRec)
                .append(" author: ").append(author)
                .append(" number of pages: ").append(nbrPages)
                .append(" Price: ").append(price);
        return sb.toString();
    }
}
