package RootOfModel;

public class Bell implements Ringeable{

    public Bell() {
    }

    @Override
    public void ring() throws InterruptedException {
        for(int i = 0;i<=10;i++){
            Thread.sleep(500);
        System.out.println("Grin Grin Grin");}
        System.out.println("SANTIC");
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
