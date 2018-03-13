//public class EventRoom extends Room {
public abstract class EventRoom extends Room implements ICheckInGuests{
    private String name;
    private int number;

    public EventRoom(String name, int capacity, int number) {
        super(capacity);
        this.name = name;
        this.number = number
    }


    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }
}
