import java.awt.image.BufferedImage;

/**
 * Created by Tdh4vnPC on 3/1/2016.
 */
public abstract class GameObject {
    protected double positionX;
    protected double positionY;
    protected BufferedImage sprite;

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }
}