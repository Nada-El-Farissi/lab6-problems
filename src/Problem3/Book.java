package Problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;
    Book(String title, String author,int n){
        super(title);
        this.author=author;
        this.nbrPages=n;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Book Title: ").append(title).append(" numRec: ")
                .append(numRec)
                .append(" author: ").append(author)
        .append(" number of pages: ").append(nbrPages);
        return sb.toString();
    }
    public String getAuthor(){
        return author;
    }
}
