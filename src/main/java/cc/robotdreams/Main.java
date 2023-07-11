package cc.robotdreams;

import cc.robotdreams.car.Car;

import java.lang.reflect.Field;

public class Main
{
    public static void main(String[] args) throws Throwable {
        Car car = new Car("BMW","M3");
        //for (Field field : car.getClass().getDeclaredFields()) {
        //    System.out.println(field.getAnnotatedType().getType() + " " + field.getName());
        //}

        car.setOptionCloseAllDoorsOnDrive(true);
        car.transmission.setDrive();
        car.doorFrontRight.open();

        String reversed = Utils.reverseString("Hello from Java application".toCharArray());
        System.out.println(reversed);

    }
}