import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Tdh4vnPC on 3/1/2016.
 */
public class Bullet extends GameObject {

    private int speed;
    private int speed1;
    private int typeBullet;

    public int getTypeBullet() {
        return typeBullet;
    }

    public void setTypeBullet(int typeBullet) {
        this.typeBullet = typeBullet;
    }

    //Constructor khong tham so truyen vao
    private Bullet() {
        positionX = 0;
        positionY = 0;
    }

    //Constructor co tham so truyen vao
    public Bullet(int positionX, int positionY, int speed, int typeBullet) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
        switch (typeBullet) {
            case 1:
                try {
                    this.sprite = ImageIO.read(new File("Resources/Dan1.png"));
                } catch (IOException e) {

                }
                break;
            case 2:
                try {
                    this.sprite = ImageIO.read(new File("Resources/Dan2.png"));
                } catch (IOException e) {

                }
                break;
            case 3:
                try {
                    this.sprite = ImageIO.read(new File("Resources/Dan1.png"));
                } catch (IOException e) {

                }
                break;
        }
    }

    //Phuong thuc di chuyen dan
    public void move() {
        this.positionY -= this.speed;
    }

    private void move2() {
        if (this.speed < 0) {
            this.positionY -= this.speed;
            this.positionX -= this.speed;
        } else {
            this.positionY -= this.speed;
            this.positionX += this.speed;
        }
}


    //Phuong thuc cap nhat trang thai di chuyen vien dan
    public void update() {
        move();

    }

    //Phuong thuc ve dan
    public void draw(Graphics g) {
        g.drawImage(sprite, (int) positionX, (int) positionY, null);
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getSpeed1() {
        return speed1;
    }

    public void setSpeed1(int speed1) {
        this.speed1 = speed1;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
