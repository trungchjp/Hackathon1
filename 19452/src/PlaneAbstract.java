import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/**
 * Created by Admin on 3/2/2016.
 */
public abstract class PlaneAbstract extends GameObject{
    protected int speed;
    protected int direction;
    protected int dam;
    protected int hp;
    protected int planeType;
    protected int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    protected Vector<Bullet> vecBul = new Vector<Bullet>();
    protected PlaneAbstract(){
    }
    public PlaneAbstract(int positionX,int positionY,int speed, int planeType){
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
        switch (planeType){
            case 1:
                try {
                    this.sprite = ImageIO.read(new File("Resources/Plane1.png"));
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    this.sprite = ImageIO.read(new File("Resources/Plane2.png"));
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    this.sprite = ImageIO.read(new File("Resources/Plane3.png"));
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                break;
            case 4:
                try {
                    this.sprite = ImageIO.read(new File("Resources/Plane4.png"));
                }
                catch (IOException e){
                    e.printStackTrace();
                }
                break;
            case 5:
                try {
                    this.sprite = ImageIO.read(new File("Resources/PlaneEnemy1.png"));
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 6:
                try {
                    this.sprite = ImageIO.read(new File("Resources/PlaneEnemy2.png"));
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }


    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPlaneType() {
        return planeType;
    }

    public void setPlaneType(int planeType) {
        this.planeType = planeType;
    }

    public int getDam() {
        return dam;
    }

    public void setDam(int dam) {
        this.dam = dam;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }



}
