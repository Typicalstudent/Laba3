import paper.OfficePaper;
import paper.Paper;

public class Xerox {
    private static String buffer;

    public static void copy(String content) {
        buffer= content;
    }

    public static OfficePaper ret() {return new OfficePaper(buffer);}
}
