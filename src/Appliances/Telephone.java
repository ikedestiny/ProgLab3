package Appliances;


import RootOfModel.Ringeable;
import RootOfModel.RoomAppliance;

public class Telephone extends RoomAppliance implements Ringeable {


    public Telephone() {
    }

    @Override
    public void ring() {
        System.out.println("Grin Grin Grin");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
