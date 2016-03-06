/**
 * Created by Quang Đại on 6/3/2016.
 */
public abstract class DongVat implements DongVatInterface{
    private int x, y;

    protected DongVat() {

    }

    public DongVat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
