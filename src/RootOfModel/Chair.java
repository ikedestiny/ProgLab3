package RootOfModel;

public class Chair {
    public Chair() {
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
