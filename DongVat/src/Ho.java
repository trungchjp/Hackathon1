import java.awt.image.BufferedImage;

/**
 * Created by Admin on 3/6/2016.
 */
public  class Ho extends Meo implements DongVatInterface{


    @Override
    public BufferedImage hinhAnh() {
        return null;
    }

    public void mauLong(){

        System.out.println("Mau vang");
    }
    public void tiengKeu(){
        System.out.println("Gru...Gru..");
    }
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
    public void display(){
        moiTruong();
        thucAn();
        diChuyen();
    }


}
