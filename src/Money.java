public class Money {
    private  int id;
    private int check;

    public Money() {
    }

    public Money(int id, int check) {
        this.id = id;
        this.check = check;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }
}
