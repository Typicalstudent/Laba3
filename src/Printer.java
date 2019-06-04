import paper.*;

public class Printer {

    public OfficePaper printText(OfficePaper paper, int newLen, int newHig, String content) {
        System.out.println("printing text" );
        paper.used();
        paper.setLen(newLen);
        paper.setHig(newHig);
        paper.setContent(content);
        Xerox.copy(content);
        return Xerox.ret();
    }
    public void printImage(PhotoPaper paper, int newLen, int newHig) {
        System.out.println("printing image");
        paper.used();
        paper.setLen(newLen);
        paper.setHig(newHig);
    }
}