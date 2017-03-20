package display;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Brigadoon on 3/16/2017.
 */
public class GameScenePanel extends JPanel {

    /* The game associated with this panel */
    private Game gameRef;

    /**
     * Constructor
     * */
    public GameScenePanel(Game gameRef) {
        super();
        this.setLayout(null);
        this.setGameRef(gameRef);
        this.setBounds(0,0,gameRef.getUnscaledWidth(), gameRef.getUnscaledHeight());

    }

    public Game getGameRef() {
        return gameRef;
    }

    public void setGameRef(Game sceneRef) {
        this.gameRef = sceneRef;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        gameRef.nextFrame(g);
    }

    @Override
    public String toString() {

        return gameRef.getId() + " (width = " + this.getWidth()
                + ", height = " + this.getHeight();

    }
}