import paper.OfficePaper;
import paper.Paper;
import paper.PhotoPaper;

public class Human {

    public Paper PaperFill(int i) {
        if(i == 0) {
            return new OfficePaper();
        }
        else{
            return new PhotoPaper();
        }
    }
}