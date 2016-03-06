import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/**
 * Created by Tdh4vnPC on 3/1/2016.
 */
public abstract class PlaneEnemy extends PlaneAbstract{

    protected int count = 0;
    protected PlaneEnemy(){
        super();
    }
    protected PlaneEnemy(int positionX, int positionY, int speed, int planeType) {
        super(positionX, positionY, speed, planeType);//goi phuong thuc khoi tao co tham so cua class PlaneAbstract
    }

    public void shot(){

    }
    public void multiFire(){
        if(this.speed < 0){
            this.positionY -= this.speed;
            this.positionX -= this.speed/3;
        }
        else{
            this.positionY += this.speed;
            this.positionX -= this.speed/3;
        }
    }

//    public void move(){
//        this.positionX +=this.speed;
//        if(this.positionX <=0){
//            this.positionX =-this.speed;
//        }
//        if(this.positionX >=400){
//            this.positionX =-this.speed;
//        }
//    }

    public void update(){
        count++;
        if(count >=120){
            this.shot();
            count = 0;
        }
    }

    public void draw(Graphics g){
        g.drawImage(sprite,(int)positionX,(int)positionY,null);
    }

}
