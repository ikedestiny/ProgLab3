import RootOfModel.Gender;
import RootOfModel.Person;
import RootOfModel.Position;

public  class Worker extends Person {
    private Position position;
    private int id;
    private int salary;
    public Worker(String name, int age, Gender gender, Position position) {
        super(name, age, gender);
        this.position = position;
        this.id = position.ordinal()+19875;
    }

    public void work(){
            System.out.println("Doing my job as "+this.getPosition());
        }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


}
