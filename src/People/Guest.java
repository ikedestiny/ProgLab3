package People;

import Appliances.Closet;
import Appliances.Shelf;
import Appliances.Telephone;
import Model.Hotel;
import Model.Room;
import RootOfModel.Gender;
import RootOfModel.RoomAppliance;

public class Guest extends Person {

    private boolean hasBookedRoom = false;
    private Room room;

    public Guest(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public void bookRoom(Hotel hotel, int RoomNumber) {
        this.hasBookedRoom = true;
        this.room = hotel.getRooms().get(RoomNumber);
        room.setBooked(true);
    }

    public void call(Receptionist receptionist) throws InterruptedException {
        for (RoomAppliance appliance : room.getAppliances()) {
            if (appliance.getClass().getSimpleName().equalsIgnoreCase("Telephone")) {
                Telephone telephone = (Telephone) appliance;
                this.call(receptionist, telephone);
            }
        }
    }


    public void layOnBed() throws InterruptedException {
        if (this.hasBookedRoom) {
            Thread.sleep(1500);
            System.out.println("Guest " + this.getName() + " is resting ");
            Thread.sleep(1500);
            System.out.println("Laying on bed");
            Thread.sleep(2000);

        }
    }


    public void openCloset() {
        for (RoomAppliance appliance : room.getAppliances()) {
            if (appliance.getClass().getSimpleName().equalsIgnoreCase("closet")) {
                Closet closet = new Closet();
                closet.openClose();
            }
        }
    }

    public boolean isHasBookedRoom() {
        return hasBookedRoom;
    }

    public Room getRoom() {
        return room;
    }

    public void getSettled() throws InterruptedException {
        for (RoomAppliance appliance : getRoom().getAppliances()) {
            if (appliance.getClass().getSimpleName().equalsIgnoreCase("shelf")) {
                Shelf shelf = (Shelf) appliance;
                Thread.sleep(200);
                System.out.println("Removes hat and places it in shelf");
                shelf.occupy();
            }
        }
    }
}
