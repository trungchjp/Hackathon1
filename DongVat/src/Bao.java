import java.awt.image.BufferedImage;

/**
 * Created by Admin on 3/6/2016.
 */
public class Bao extends Meo implements DongVatInterface{
    public void moiTruong(){
        super.moiTruong();
        System.out.println("Song duoi nuoc ngot");
    }
    public void thucAn(){
        super.thucAn();
        System.out.println("giun");
    }
    public void diChuyen(){
        super.diChuyen();

    }
    public void tiengKeu(){

    }

    @Override
    public BufferedImage hinhAnh() {
        return null;
    }
    public void display(){
        moiTruong();
        thucAn();
        diChuyen();
    }

}
