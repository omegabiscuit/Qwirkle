package util;

/**
 * Created by Brigadoon on 3/16/2017.
 */
public class GameClock {

    private long startTime;

    public GameClock(){
        resetGameClock();
    }

    // returns milliseconds passed between the previous two elapsedTime() calls
    public double getElapsedTime() {
        return (System.nanoTime() - startTime) / 1000000.0;
    }

    // resets both times to current time
    public void resetGameClock() {
        startTime = System.nanoTime();
    }

}