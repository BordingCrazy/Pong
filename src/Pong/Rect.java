package Pong;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rect {

    private int x, y, height, width;
    private Color color;

    public Rect(int x, int y, int height, int width, Color color){

        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public void draw(Graphics2D g2){

        g2.setColor(color);
        g2.fillRect(x, y, width, height);
    }
}
