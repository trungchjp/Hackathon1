import java.awt.image.BufferedImage;

/**
 * Created by Admin on 3/6/2016.
 */
public class ChimBoCau extends Chim implements DongVatInterface {
    @Override
    public BufferedImage hinhAnh() {
        return null;
    }
    public void tamBay(){
        System.out.println("Do cao toi da co the bay: Bay tam thap");
    }
    public void thucAn(){
        System.out.println("Thuc an chu yeu: Thoc, gao");
    }
    public void kichThuoc(){
        System.out.println("Kich thuoc co the: Nho");
    }
    public void display(){
        moiTruong();
        thucAn();
        diChuyen();
    }

}
