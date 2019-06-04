package paper;

abstract public class Paper {
    protected int len;
    protected int hig;
    boolean isUsed;
    protected String content;

    public Paper() {
        len = 100;
        hig = 20;
        isUsed = false;
        content = null;
    }

    abstract public void setLen(int len);
    abstract public void setHig(int hig);
}
