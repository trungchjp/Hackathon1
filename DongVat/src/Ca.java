/**
 * Created by Quang Đại on 6/3/2016.
 */
public abstract class Ca extends DongVat implements DongVatInterface {
    protected void hinhDang(){}

    public Ca(){
        super();
    }

    public Ca(int x, int y){
        super(x,y);
    }

    @Override
    public void gioiThieu() {
        System.out.println("Day la Ho Ca");
    }

    @Override
    public void moiTruong() {
        System.out.println("Song duoi nuoc");
    }

    @Override
    public void thucAn() {
        System.out.println("An thit");
    }

    @Override
    public void diChuyen() {

    }
}
