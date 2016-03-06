import java.awt.*;
import java.util.Vector;

/**
 * Created by Quang Đại on 6/3/2016.
 */
public class PlaneEnemy3 extends PlaneEnemy {
    private Vector<Bullet> vecBul = new Vector<>();
    private int e;
    public PlaneEnemy3() {
        super();
    }

    public PlaneEnemy3(int positionX, int positionY, int speed, int planeType) {
        super(positionX, positionY, speed, planeType);
    }

    public void shot() {
        Bullet bullet1 = new Bullet((int)positionX + 15, (int)positionY + 59, -5, 1);
        Bullet bullet = new Bullet((int)positionX - 15, (int)positionY + 59, -5, 1);
        vecBul.add(bullet);
        vecBul.add(bullet1);
    }

    public void move() {
        e++;
        this.positionY += 1.5*Math.sin(e*0.04);
        this.positionX += this.speed;
        if (this.positionX <=0) {

            this.positionY -= 1.5*Math.sin(e*0.04);
            this.speed=-this.speed;
        }
        if(this.positionX>=1000-this.sprite.getWidth()){
            this.positionY -= 1.5*Math.sin(e*0.04);
            this.speed=-this.speed;
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
