import javax.imageio.ImageIO;
import javax.print.attribute.standard.MediaSize;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Quang Đại on 6/3/2016.
 */
public class OtherObject extends GameObject {
    private int typeObject;
    private Random random = new Random();

    private OtherObject() {
        super();
    }

    public OtherObject(int positionX, int positionY, int typeObject) {
        this.positionX = positionX;
        this.positionY = positionY;
        switch (typeObject) {
            case 1:
                try {
                    this.sprite = ImageIO.read(new File("Resources/mountain.png"));
                } catch (IOException e) {

                }
                break;
            case 2:
                try {
                    this.sprite = ImageIO.read(new File("Resources/island.png"));
                } catch (IOException e) {

                }
                break;
            case 3:
                try {
                    this.sprite = ImageIO.read(new File("Resources/bird.png"));
                } catch (IOException e) {

                }
                break;
        }
    }

    public void draw(Graphics g) {
        g.drawImage(sprite, (int) positionX, (int) positionY, null);
    }

    public int getTypeObject() {
        return typeObject;
    }

    public void setTypeObject(int typeObject) {
        this.typeObject = typeObject;
    }
}
