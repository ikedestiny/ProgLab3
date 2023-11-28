package RootOfModel;

public class TV implements Onable {
    boolean isOn = false;
    @Override
    public void toggleSwitch() {
        if (this.isOn){
            this.isOn= false;
        }else{
            this.isOn = true;
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
