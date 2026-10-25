package Problem3;

public class Magazine extends Document {
    private String month;
    private int year;
    Magazine(String title, String month,int year){
        super(title);
        this.month=month;
        this.year=year;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Magazine Title: ").append(title).append(" numRec: ")
                .append(numRec)
                .append(" Date: ").append(month).append("/")
                .append(year);
        return sb.toString();
    }
}
