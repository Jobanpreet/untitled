import jdk.jfr.Category;

public class category {
    private String catcode;
    private String catdesc;
    category (String catcode, String catdesc){
        this. catcode = catcode;
        this. catdesc = catdesc; }

    public String getCatcode() { return catcode; }
    public void setcatcode(String catcode) { this. catcode = catcode; }
    public String getCatdesc() { return catdesc; }
    public void setCatdesc(String catdesc) { this. catdesc = catdesc; }
}
