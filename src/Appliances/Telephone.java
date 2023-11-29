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


}
