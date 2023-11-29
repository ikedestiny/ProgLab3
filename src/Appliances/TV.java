package Appliances;

import RootOfModel.Onable;
import RootOfModel.RoomAppliance;

public class TV extends RoomAppliance implements Onable {
    boolean isOn = false;

    @Override
    public void toggleSwitch() {
        this.isOn = !this.isOn;

    }
}
