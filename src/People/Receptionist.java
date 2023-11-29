package People;

import Appliances.Telephone;
import Model.Hotel;
import Model.Room;
import RootOfModel.Gender;
import RootOfModel.Position;

public class Receptionist extends Worker {
    public Receptionist(String name, int age, Gender gender) {
        super(name, age, gender, Position.RECEPTIONIST);
    }

    public void welcomeGuest(Guest guest, Hotel hotel) {
        System.out.println("Good day " + guest.getName() + " welcome to " + hotel.getName());
    }

    public void giveRoomToGuest(Guest guest, int roomNumber) {
        Room room = new Room(roomNumber);
        if (!room.isBooked()) {
            System.out.println(guest.getName() + " your room number is " + room.getNumber());
            room.setBooked(true);
        } else {
            giveRoomToGuest(guest, roomNumber + 1);
            System.out.println("Model.Room " + roomNumber + " is already occupied so you'll be in room " + roomNumber + 1);
        }
    }

    public void callGuest(Guest guest, Telephone telephone) throws InterruptedException {
        this.call(guest, telephone);
    }

    public void giveGuestKey(Guest guest) throws InterruptedException {
        if (guest.isHasBookedRoom()) {
            Thread.sleep(500);
            System.out.println("This is the Key to the room " + guest.getRoom().getNumber());
            Thread.sleep(500);
            System.out.println("Have a nice day");
        }
    }
}
