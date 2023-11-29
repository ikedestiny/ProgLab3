package People;

import Appliances.Telephone;
import RootOfModel.Gender;

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
        return this.getClass().getSimpleName().length() + id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }


    @Override
    public String toString() {
        return " " + this.getClass().getSimpleName().toUpperCase();
    }


}
