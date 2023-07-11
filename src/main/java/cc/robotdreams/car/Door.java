package cc.robotdreams.car;

final public class Door
{
    private final Car     car;
    private       boolean locked = false;

    Door(Car car) {
        this.car = car;
        car.doors.add(this);
    }

    public void setLocked(boolean value) {
        this.locked = value;
    }

    public void open() {
        if (locked)
            System.err.println("Door is locked can't open");
        else
            System.out.println("Door is opened");
    }

    protected void internalOpen() {
        System.out.println("Door is opened");
    }
}
