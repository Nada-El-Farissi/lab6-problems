package Problem3;

public class Document {
    private static int counter=0;
    protected int numRec;
    protected String title;
    Document(String title){
        this.numRec=++counter;
        this.title=title;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Title: ").append(title).append(" numRec: ")
                .append(numRec);
        return sb.toString();
    }
    public int getNumRec(){
        return numRec;
    }
}
