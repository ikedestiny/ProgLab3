package Model;

import People.Receptionist;
import People.Worker;
import RootOfModel.RoomAppliance;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private static int objectCount = 0;
    private final String name;
    private final int id;
    private final List<Room> rooms;
    private final List<Worker> workers;
    private final Receptionist receptionist;

    public Hotel(String name, Receptionist receptionist) {
        this.name = name;
        this.receptionist = receptionist;
        System.out.println("The cheapest rooms in the world".toUpperCase());
        this.rooms = new ArrayList<>();
        this.workers = new ArrayList<>();
        objectCount++;
        this.id = objectCount;

    }

    public List<Room> getRooms() {

        return rooms;
    }

    public void fillSomeRooms(int numberOfRooms) {
        for (int i = 0; i <= numberOfRooms; i++) {
            Room newRoom = new Room(Integer.parseInt("10" + i));
            if (i < 20) {
                newRoom.setBooked(true);
            }
            this.rooms.add(newRoom);
        }
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }


    public String getName() {
        return name;
    }


    public void setRoomsPrice(int price) {
        for (Room room : this.getRooms()) {
            room.setPrice(price);
        }
    }

    public void addAppliance(RoomAppliance appliance) {
        for (Room room : this.getRooms()) {
            room.addAppliance(appliance);
        }
    }

    public int hashCode() {
        return this.getClass().getSimpleName().length() + id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }


    @Override
    public String toString() {
        return " " + this.getClass().getSimpleName().toUpperCase();
    }
}
