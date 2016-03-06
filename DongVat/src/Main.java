/**
 * Created by Trung Chjp on 3/6/2016.
 */
public class Main {
    public static void main(String[] args) {
        Window zoo= new Window() ;
        Thread thread =new Thread(zoo);
        thread.start();
    }
}
