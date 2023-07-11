package cc.robotdreams.car;

import java.util.ArrayList;
import java.util.List;

public class Car
{
    final public String brand;
    final public String model;
    final public Transmission transmission = new Transmission();

    final List<Door> doors = new ArrayList<>();

    final public Door doorFrontRight    = new Door(this);
    final public Door doorFrontLeft     = new Door(this);
    final public Door doorReadRight     = new Door(this);
    final public Door doorRearLeft      = new Door(this);

    boolean closeAllDoorsOnDrive = false;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;

        this.transmission.addHook("setDrive", o -> {
                if (Car.this.closeAllDoorsOnDrive) {
                    // Do something
                    Car.this.doors.forEach(door -> door.setLocked(true));
                }
                return o;
            }
        );
    }

    public void setOptionCloseAllDoorsOnDrive(boolean value) {
        closeAllDoorsOnDrive = value;
    }

    //public boolean getOptionCloseAllDoorsOnDrive() {
    //    return closeAllDoorsOnDrive;
    //}

}
