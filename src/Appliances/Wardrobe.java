package Appliances;

import RootOfModel.Occupyable;
import RootOfModel.RoomAppliance;

public class Wardrobe extends RoomAppliance implements Occupyable {
    private boolean occupied;

    public Wardrobe() {
    }


    @Override
    public void occupy() {
        this.setOccupied(true);
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
