package RootOfModel;

public abstract class RoomAppliance {
    private static int objectCount = 0;
    private final int id;

    public RoomAppliance() {
        objectCount++;
        this.id = objectCount;
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
        return this.getClass().getSimpleName().toUpperCase();
    }
}
