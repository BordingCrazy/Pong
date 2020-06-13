package Pong;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Window extends JFrame implements Runnable {

    Graphics2D g2;
    kl keyListener = new kl();

    public Window() {
        this.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(keyListener);//adds keyListener components

        g2 = (Graphics2D)this.getGraphics();
    }

    public void update (double dt){

        g2.setColor(Color.BLACK);
        g2.fillRect(0,0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);

        if(keyListener.isKeyPressed(KeyEvent.VK_UP)){
            System.out.println("user is pressing up.");
        }
        else if(keyListener.isKeyPressed(KeyEvent.VK_DOWN)){
            System.out.println("down");
        }
    }
    public void run() {

        double lastFrameTime = 0.0;

        while (true){

            double time = Time.getTime();
            double deltaTime = time - lastFrameTime;
            lastFrameTime = time;

            update(deltaTime);

            try{
                //sets frame rate to a specific number
                Thread.sleep(15);
            }catch (Exception e) {

            }
        }
    }
}
