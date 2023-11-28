import RootOfModel.Gender;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Hotel hotel = new Hotel();
        Guest guests = new Guest("Dunno and Kozlik",25, Gender.MALE);


        guests.bookRoom(hotel, 40);
        guests.layOnBed();

        guests.callWorker(Hotel.getReceptionist());





    }
}
