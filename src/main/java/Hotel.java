import java.awt.*;
import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<EventRoom> eventRooms;
//    private DiningRoom  diningRoom;
//    private ConferenceRoom conferenceRoom;

    public Hotel(String name) {
        this.name = name;
        bedrooms = new ArrayList<Bedroom>();
        eventRooms = new ArrayList<EventRoom>();
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return new ArrayList<Bedroom>(bedrooms);
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<EventRoom> getEventRooms() {
        return new ArrayList<EventRoom>(eventRooms);
    }

    public setEventRooms(ArrayList<EventRoom> eventRooms) {
        this.eventRooms = eventRooms;
    }

//    public DiningRoom getDiningRoom() {
//        return diningRoom;
//    }
//
//    public void setDiningRoom(DiningRoom diningRoom) {
//        this.diningRoom = diningRoom;
//    }

//    public ConferenceRoom getConferenceRoom() {
//        return this.conferenceRoom;
//    }
//
//    public void setConferenceRoom(ConferenceRoom conferenceRoom) {
//        this.conferenceRoom = conferenceRoom;
//    }



    // OTHERS
    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    // ICheckInGuests
//    public void checkInGuestsToDiningRoom(ArrayList<Guest> guests) {
//        this.diningRoom.checkInGuests(guests);
//    }

    // ICheckInGuests
//    public void checkInGuestsToConferenceRoom(ArrayList<Guest> guests) {
//        this.conferenceRoom.checkInGuests(guests);
//    }




    public ArrayList<Guest> getGuestsCheckedIntoBedroom(int number) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                return room.getGuests();
            }
        }
        return new ArrayList<Guest>();
    }

    // ICheckInGuests ** Override to find room.... maybe?
    public void checkGuestsIntoEventRoom(int number, ArrayList<Guest> guestList) {
        for (EventRoom room : eventRooms) {
            if (room.getNumber() == number) {
                room.checkInGuests(guestList);
                return;
            }
        }
    }


    public void checkGuestsIntoBedroom(int number, ArrayList<Guest> guestList) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                room.checkInGuests(guestList);
                return;
            }
        }
    }


    public void checkGuestsIntoBedroomForNumberOfNights(int number, ArrayList<Guest> guestList, int numberOfNights) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                room.checkInGuestsForNumberOfNights(guestList, numberOfNights);
                return;
            }
        }
    }

    public void checkGuestsOutOfBedroom(int number) {
        for (Bedroom room : bedrooms) {
            if (room.getNumber() == number) {
                room.checkOut();
                return;
            }
        }
    }

    public ArrayList<Bedroom> getAvailableBedrooms() {
        ArrayList<Bedroom> availableRooms = new ArrayList<Bedroom>();
        for (Bedroom room : bedrooms) {
            if (room.isVacant()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
}
