import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/**
 * Created by Admin on 3/5/2016.
 */
public class PlaneEnemy2 extends PlaneEnemy {

//    private Vector<Bullet> vecBul = new Vector<>();

    public PlaneEnemy2() {
        super();
    }

    public PlaneEnemy2(int positionX, int positionY, int speed, int planeType) {
        super(positionX, positionY, speed, planeType);
    }

    public void shot() {
        Bullet bullet1 = new Bullet((int)positionX + 15, (int)positionY + 59, -5, 1);
        Bullet bullet = new Bullet((int)positionX - 15, (int)positionY + 59, -5, 1);
        vecBul.add(bullet);
        vecBul.add(bullet1);
    }

    public void move() {
        this.positionX += this.speed;
        if (this.positionX <= 0) {
            this.speed = -this.speed;
        }
        if (this.positionX >= 400 - this.getSprite().getWidth()) {
            this.speed = -this.speed;
        }
    }

    public void update() {
        count++;
        if (count >= 90) {
            this.shot();
            count = 0;
        }
        for (Bullet bul : vecBul) {
            bul.update();
        }
        move();
    }

    public void draw(Graphics g) {
        for (Bullet bul : vecBul) {
            bul.draw(g);
        }
        g.drawImage(sprite, (int)positionX, (int)positionY, null);
    }
}
