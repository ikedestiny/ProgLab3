import RootOfModel.Gender;
import RootOfModel.Position;
import RootOfModel.Telephone;

public class Receptionist extends Worker{
    public Receptionist(String name, int age, Gender gender) {
        super(name, age, gender, Position.RECEPTIONIST);
    }

    public void welcomeGuest(Guest guest){
        System.out.println("Good day "+guest.getName()+" welcome to "+Hotel.name);
    }

    public void giveRoomToGuest(Guest guest, int roomNumber){
        Room room = new Room(roomNumber);
        if (!room.isBooked()){
            System.out.println(guest.getName()+" your room number is "+room.getNumber());
            room.setBooked(true);
        }else{giveRoomToGuest(guest,roomNumber+1);}
    }

    public void callGuest(Guest guest){
        Telephone telephone = new Telephone();
        telephone.call(guest);
    }
}
