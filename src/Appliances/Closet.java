package Appliances;

import RootOfModel.RoomAppliance;

public class Closet extends RoomAppliance {
    private boolean open;

    public Closet() {

    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void openClose() {
        open = !this.isOpen();
        System.out.println("Opens Closet");
    }


}

