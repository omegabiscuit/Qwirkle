import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import display.Game;
import util.GameClock;


/**
 * Example game that utilizes our engine. We can create a simple prototype game with just a couple lines of code
 * although, for now, it won't be a very fun game :)
 */
public class LabOneGame extends Game {
    /* Create a sprite object for our game. We'll use mario */

    //Sprite mario = new Sprite("Mario", "braid.png");
    GameClock clock = new GameClock();


    /**
     * Constructor. See constructor in Game.java for details on the parameters given
     */
    public LabOneGame() {
        super("Lab One Test Game", 1200, 800);
    }

    /**
     * Engine will automatically call this update method once per frame and pass to us
     * the set of keys (as strings) that are currently being pressed down
     */
    @Override
    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();



    }


    @Override
    public void update(ArrayList<String> pressedKeys) {
        super.update(pressedKeys);

    }

    /**
     * Engine automatically invokes draw() every frame as well. If we want to make sure mario gets drawn to
     * the screen, we need to make sure to override this method and call mario's draw method.
     */
    @Override
    public void draw(Graphics g) {
        super.draw(g);


    }


    /**
     * Quick main class that simply creates an instance of our game and starts the timer
     * that calls update() and draw() every frame
     */
    public static void main(String[] args) {
        LabOneGame game = new LabOneGame();
        game.start();

    }
}