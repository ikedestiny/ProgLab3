import RootOfModel.Gender;
import RootOfModel.Person;
import RootOfModel.Telephone;

public class Guest extends Person {

    boolean hasBookedRoom =false;
    Room room;
    public Guest(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public void bookRoom(Hotel hotel,int RoomNumber){
        this.hasBookedRoom = true;
        this.room = hotel.getRooms().get(RoomNumber);
        room.setBooked(true);
    }
    public void callWorker(Worker worker){
        Telephone telephone = new Telephone();
        telephone.call(Hotel.receptionist);
    }


    public void layOnBed() throws InterruptedException {
        if(this.hasBookedRoom){
        Thread.sleep(1500);
        System.out.println("Guest "+this.getName()+" is resting ");
        Thread.sleep(1500);
        System.out.println("Laying on bed");
        Thread.sleep(2000);
        room.getBell().ring();
        Thread.sleep(1000);
        room.getHole().blink();

        }


    }


}
