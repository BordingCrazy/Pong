package Pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class kl implements KeyListener {

    private boolean keyPressed[] = new boolean[128];//array, Keylistener has 128 keys

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        keyPressed[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {

        keyPressed[e.getKeyCode()] = false;
    }

    //returns true if the keyCode is true inside the array.
    public boolean isKeyPressed(int keyCode){

        return keyPressed[keyCode];
    }
}
