package Qwirkle; /**
 * Created by Brigadoon on 3/16/2017.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JLabel;

import javax.sound.sampled.*;

import display.Game;
import util.GameClock;

public class RunGame extends Game {

    JLabel label;
    int counter;
    int lastTime;
    Clip clip;
    static int healthBar;


    static GameClock clock;

    public RunGame() {
        super("Qwirkle", 800, 800);

        clock = new GameClock();

        counter = 60;
    }



    @Override
    public void update(ArrayList<String> pressedKeys) {
        super.update(pressedKeys);

    }

    @Override
    public void draw(Graphics g){
        super.draw(g);

        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 140, 30);
    }


    @Override
    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

    }
    public static void main(String[] args) {
       RunGame game = new RunGame();
       game.start();

    }
}