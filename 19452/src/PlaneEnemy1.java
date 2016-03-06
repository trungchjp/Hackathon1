import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/**
 * Created by Admin on 3/5/2016.
 */
public class PlaneEnemy1 extends PlaneEnemy {

    private Vector<Bullet> vecBul = new Vector<>();
    //goi phuong thuc khoi tao khong tham so trong PlaneEnemy
    private int e = 0;

    public PlaneEnemy1() {
        super();
    }

    //goi phuong thuc khoi tao co tham so trong PlaneEnemy
    public PlaneEnemy1(int positionX, int positionY, int speed, int planeType) {
        super(positionX, positionY, speed, planeType);
    }

    //phuong thuc ban dan cua may bay bay theo hinh elip
    public void shot() {
        Bullet bullet = new Bullet((int)positionX + 15, (int)positionY + 59, -5, 1);
        vecBul.add(bullet);

    }

    //phuong thuc di chuyen cua may bay dich
    public void moveElip() {
        e++;
        this.positionX += 6 * Math.sin(e * 0.09);
        this.positionY += 4 * Math.cos(e * 0.09);
    }

    //phuong thuc cap nhat trang thai cua may bay dich
    public void update() {
        count++;
        if (count >= 120) {
            this.shot();
            count = 0;
        }
        for (Bullet bullet : vecBul) {
            bullet.update();
        }
        this.moveElip();

    }

    //phuong thuc ve lai may bay dich
    public void draw(Graphics g) {
        super.draw(g);
        g.drawImage(sprite, (int)positionX,(int) positionY, null);
        for (Bullet bullet : vecBul) {
            bullet.draw(g);
        }
    }
}
