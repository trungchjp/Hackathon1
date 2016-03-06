/**
 * Created by Quang Đại on 6/3/2016.
 */
public abstract class Meo extends DongVat implements DongVatInterface {
    protected Meo() {
        super();
    }

    protected Meo(int x, int y) {
        super(x, y);
    }

    @Override
    public void gioiThieu() {
        System.out.println("GIoi thieu: Day la Ho Meo");
    }

    @Override
    public void moiTruong() {
        System.out.println("Moi truong song chu yeu: Song tren can");
    }

    @Override
    public void thucAn() {
        System.out.println("Thuc an chu yeu: An thit");
    }

    @Override
    public void diChuyen() {

    }
    protected void mauLong(){

    }
    protected void tiengKeu(){

    }
}
