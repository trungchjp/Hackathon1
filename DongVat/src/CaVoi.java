import java.awt.image.BufferedImage;

/**
 * Created by Admin on 3/6/2016.
 */
public class CaVoi extends Ca implements DongVatInterface{
    public void diCchuyen(){
        super.diChuyen();
    }
    public void thucAn(){
        super.thucAn();
        System.out.println("An thit ca nho hon");
    }

    @Override
    public BufferedImage hinhAnh() {
        return null;
    }

    public void moiTruong(){
        super.moiTruong();
        System.out.println("Song trong moi truong nuoc man");
    }
    public void display(){
        moiTruong();
        thucAn();
        diChuyen();
    }

}
