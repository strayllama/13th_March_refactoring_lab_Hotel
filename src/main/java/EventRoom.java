//public class EventRoom extends Room {
public abstract class EventRoom extends Room implements ICheckInGuests{
    private String name;

    public EventRoom(String name, int capacity) {
        super(capacity);
        this.name = name;
    }


    public String getName() {
        return this.name;
    }
}
