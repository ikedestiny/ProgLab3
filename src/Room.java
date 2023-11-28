import RootOfModel.*;

public class Room {
    private int number;
    Bell bell;
    Chair chair;
    PeepHoleBulb hole;
    Telephone telephone;
    Wardrobe wardrobe;
    TV televison;
    int price = 50;
    private boolean booked;

    public Room(int number) {
        this.number = number;
        this.bell = new Bell();
        this.telephone = new Telephone();
        this.hole = new PeepHoleBulb();
        this.chair = new Chair();
        this.televison = new TV();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        this.setBooked(false);
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public Bell getBell() {
        return bell;
    }

    public Chair getChair() {
        return chair;
    }

    public PeepHoleBulb getHole() {
        return hole;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public int getPrice() {
        return price;
    }

    public TV getTelevison() {
        return televison;
    }

    public void turnOnTV(){
        this.getTelevison().toggleSwitch();
    }
}
