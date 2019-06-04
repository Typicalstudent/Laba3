package paper;

public class OfficePaper extends Paper {

    public OfficePaper() {
        len = 100;
        hig = 20;
    }

    public OfficePaper(String content) {
        len = 100;
        hig = 20;
        this.content = content;
    }

    public void used() {isUsed = true;}

    public void setLen(int len) {this.len = len;}
    public void setHig(int hig) {this.hig = hig;}
    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {return content;}
}