package Problem3;
import java.util.List;
import java.util.ArrayList;

public class Library {
    private int capacity;
    private List<Document> documents;
    Library(int capacity){
        this.capacity=capacity;
        this.documents = new ArrayList<>();
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
         sb.append("The library's capacity is: ").append(capacity)
                 .append("\n The documents in the library are: ");
         for (int i=0; i<documents.size(); i++){
             sb.append("\n ").append(documents.get(i).toString());
         }
         return sb.toString();
    }
    public void displayDocuments(){
        for (int i=0;i<documents.size();i++){
            System.out.println(documents.get(i).toString());
        }
    }
    public boolean add(Document doc){
        if (documents.size()<capacity){
            documents.add(doc);
            return true;
        }
        return false;
    }
    public boolean delete(Document doc){
        for (int i=0;i<documents.size();i++){
            if (doc.toString().equals(documents.get(i).toString())){
                documents.remove(doc);
                return true;
            }
        }
        return false;
    }
    public Document document(int numEnrg){
        for (int i=0;i<documents.size();i++){
            if (documents.get(i).getNumRec()==numEnrg){
                return documents.get(i);
            }
        }
        return null;
    }
    public void displayAuthors(){
        for (int i=0;i<documents.size();i++){
            if (documents.get(i) instanceof Book){
                Book book= (Book) documents.get(i);
                System.out.println(book.getAuthor());
            }
        }
    }

}
