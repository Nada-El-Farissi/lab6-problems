package Problem3;

public class Textbook extends Book {
    public String level;
    Textbook(String title, String author,int n,String level){
        super(title,author,n);
        this.level=level;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Novel Title: ").append(title).append(" numRec: ")
                .append(numRec)
                .append(" author: ").append(author)
                .append(" number of pages: ").append(nbrPages)
                .append(" Level: ").append(level);
        return sb.toString();
    }
}
