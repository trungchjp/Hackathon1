/**
 * Created by Quang Đại on 6/3/2016.
 */
public abstract class Chim extends DongVat implements DongVatInterface {
    public Chim(){
        super();
    }

    public Chim(int x, int y){
        super(x,y);
    }

    @Override
    public void gioiThieu() {
        System.out.println("Day la Ho Chim");
    }

    @Override
    public void moiTruong() {
        System.out.println("Song tren troi");
    }

    @Override
    public void thucAn() {
        System.out.println("An thit");
    }

    @Override
    public void diChuyen() {

    }
}
