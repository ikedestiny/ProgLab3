import RootOfModel.Gender;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
     List<Room> rooms;
     List<Worker> workers;
     static final String name = "Экономическая";
     static Receptionist receptionist = new Receptionist("Recptionist",25, Gender.FEMALE);

     public Hotel() {
          System.out.println("The cheapest rooms in the world".toUpperCase());
          this.rooms = new ArrayList<>();
          this.workers = new ArrayList<>();

          for(int i =0; i<=50; i++){
               Room newRoom = new Room(Integer.valueOf("10"+i));
               if(i<20){
                    newRoom.setBooked(true);
               }
               this.rooms.add(newRoom);
          }

     }

     public List<Room> getRooms() {
          return rooms;
     }

     public List<Worker> getWorkers() {
          return workers;
     }

     public static Receptionist getReceptionist() {
          return receptionist;
     }
}
