package RootOfModel;

public class PeepHoleBulb  implements Onable, Blinkeable{
    boolean bulbState = false;
    @Override
    public void blink() throws InterruptedException {
        for (int i =0; i<5;i++){
            Thread.sleep(500);
        System.out.println("Blinking, Blinking, Blinking");}
        System.out.println("SANTIC");
    }

    @Override
    public void toggleSwitch() {
        if(bulbState){
            bulbState = false;
        }else{
            bulbState = true;
        }


    }

    @Override
    public int hashCode() {
        System.out.println("My own hashcode");
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("My own equals");
        return super.equals(obj);
    }



    @Override
    public String toString() {
        return " "+this.getClass();
    }
}
