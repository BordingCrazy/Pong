package Pong;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements Runnable {

    Graphics2D g2;
    kl keyListener = new kl();
    Rect playerOne, ai, ball;

    public Window() {
        this.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(keyListener);//adds keyListener components

        g2 = (Graphics2D)this.getGraphics();

        playerOne = new Rect(Constants.HZ_PADDING, 40, Constants.PADDLE_HEIGHT, Constants.PADDLE_WIDTH, Constants.PADDLE_COLOR);
        ai = new Rect(Constants.SCREEN_WIDTH - Constants.PADDLE_WIDTH - Constants.HZ_PADDING, 40, Constants.PADDLE_HEIGHT, Constants.PADDLE_WIDTH, Constants.PADDLE_COLOR);
        ball = new Rect(Constants.SCREEN_WIDTH / 2, Constants.SCREEN_HEIGHT / 2, Constants.BALL_SIZE, Constants.BALL_SIZE, Constants.BALL_COLOR);
    }

    public void update (double dt){

        g2.setColor(Color.BLACK);
        g2.fillRect(0,0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);


        playerOne.draw(g2);//draws rectangle paddle
        ai.draw(g2);
        ball.draw(g2);
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
