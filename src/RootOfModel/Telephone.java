package RootOfModel;


public class Telephone implements Ringeable{

    @Override
    public void ring() {
        System.out.println("Grin Grin Grin");
    }

    public void call(Person person){
        for (int i =0; i<6;i++){
        System.out.println("Calling "+person.getName());
        ring();
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
