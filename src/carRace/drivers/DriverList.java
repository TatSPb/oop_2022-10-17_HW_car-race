package carRace.drivers;

import java.util.HashSet;
import java.util.Set;


public class DriverList {


    public static Set<Driver> driverList = new HashSet<>();

    public static void addDriverToList(Driver<?> newDriver) {
        if (!driverList.add(newDriver)) {
            throw new RuntimeException("Данный водитель уже есть в базе");
        }
    }

    public static void printDriverList() {
        System.out.println("СПИСОК ВОДИТЕЛЕЙ: ");

        for (Driver driver : driverList) {
            System.out.println(driver.getFIO());
        }
    }
}

