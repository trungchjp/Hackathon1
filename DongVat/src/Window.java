import org.omg.PortableInterceptor.HOLDING;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Trung Chjp on 3/6/2016.
 */
public class Window extends Frame implements Runnable, MouseListener {

    Graphics seconds;
    Image image;
    int width, hieght;
    BufferedImage Tiger;
    BufferedImage Lion;
    BufferedImage Carp;
    BufferedImage Whale;
    BufferedImage Dove;
    BufferedImage Eagle;

    public Window() {

        this.setTitle("Zoo");
        this.setSize(1400, 900);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
                                   @Override
                                   public void windowClosing(WindowEvent e) {
                                       super.windowClosing(e);
                                       System.exit(0);
                                       repaint();
                                   }
                               }
        );

        try {
            Lion = ImageIO.read(new File("Anh/Sutu.png"));
            Tiger = ImageIO.read(new File("Anh/Ho.png"));
            Carp = ImageIO.read(new File("Anh/CaChep.png"));
            Whale = ImageIO.read(new File("Anh/CaVoi.png"));
            Dove = ImageIO.read(new File("Anh/BoCau.png"));
            Eagle = ImageIO.read(new File("Anh/DaiBang.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.addMouseListener(this);
    }


    public void paint(Graphics g) {
        g.drawImage(Lion, 100, 100, 250, 250, null);
        g.drawImage(Tiger, 500, 100, 250, 250, null);
        g.drawImage(Carp, 1000, 100, 250, 250, null);
        g.drawImage(Whale, 100, 500, 250, 250, null);
        g.drawImage(Eagle, 500, 500, 250, 250, null);
        g.drawImage(Dove, 1000, 500, 250, 250, null);
    }

    @Override
    public void update(Graphics g) {
        if (image == null) {
            image = createImage(this.getWidth(), this.getHeight());
            seconds = image.getGraphics();
        }
        seconds.setColor(getBackground());
        seconds.fillRect(0, 0, getWidth(), getHeight());
        seconds.setColor(getForeground());
        paint(seconds);
        g.drawImage(image, 0, 0, null);
    }

    @Override
    public void run() {
        while (true) {
            repaint();

            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getX() >= 0 && e.getX() < 250 && e.getY() >= 0 && e.getY() < 250) {

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
