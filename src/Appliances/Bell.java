package Appliances;

import RootOfModel.Ringeable;
import RootOfModel.RoomAppliance;

public class Bell extends RoomAppliance implements Ringeable {

    public Bell() {

    }

    @Override
    public void ring() throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            Thread.sleep(500);
            System.out.println("Grin Grin Grin");
        }
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

