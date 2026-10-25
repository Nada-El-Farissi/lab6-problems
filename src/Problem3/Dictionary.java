package Problem3;

public class Dictionary extends Document{
    private String language;
    Dictionary(String title, String lang){
        super(title);
        this.language=lang;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Dictionnary Title: ").append(title).append(" numRec: ")
                .append(numRec)
                .append(" Language: ").append(language);
        return sb.toString();
    }

}
