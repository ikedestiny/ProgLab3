package People;

import Appliances.Telephone;
import RootOfModel.Gender;

import java.util.Objects;

public abstract class Person {

    private static int objectCount = 0;
    private final String name;
    private final Gender gender;
    private final int age;
    private final int id;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        objectCount++;
        this.id = objectCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void call(Person person, Telephone telephone) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(300);
            if (person.getClass().getSuperclass().getSimpleName().equalsIgnoreCase("Worker")) {
                Worker worker = (Worker) person;
                System.out.println("Calling " + worker.getPosition() + " " + person.getName());
            } else {
                System.out.println("Calling " + person.getName());
            }
            telephone.ring();
        }
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getName(), getGender());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Person person = (Person) obj;
        return Objects.equals(getName(), person.getName()) && getAge() == person.getAge() && getGender() == person.getGender();
    }
    @Override
    public String toString() {
        return "Person " + getName();
    }


}
