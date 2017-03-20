package events;
import display.Sprite;


/**
 * Created by Brigadoon on 3/16/2017.
 */
public interface IEventListener {
    void handleEvent(Event event);
    void handleEvent(Event event, Sprite sprite);
}
