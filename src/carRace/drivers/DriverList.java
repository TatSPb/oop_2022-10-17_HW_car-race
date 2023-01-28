package carRace.drivers;

import java.util.HashSet;
import java.util.Set;


public class DriverList {

    public static Set<DriverB> driverBList = new HashSet<>();
    public static void addDriverBToList(DriverB newDriver) {
        if (!driverBList.add(newDriver)) {
            throw new RuntimeException("Данный водитель категории B уже есть в базе");
        }
    }

    public static Set<DriverC> driverCList = new HashSet<>();
    public static void addDriverCToList(DriverC newDriver) {
        if (!driverCList.add(newDriver)) {
            throw new RuntimeException("Данный водитель категории C уже есть в базе");
        }
    }

    public static Set<DriverD> driverDList = new HashSet<>();
    public static void addDriverDToList(DriverD newDriver) {
        if (!driverDList.add(newDriver)) {
            throw new RuntimeException("Данный водитель категории D уже есть в базе");
        }
    }

    public static void printDriverList() {
        System.out.println("СПИСОК ВОДИТЕЛЕЙ: ");

        for (DriverB driver : driverBList) {
            System.out.println(driver.getFIO());
        }
        for (DriverC driver : driverCList) {
            System.out.println(driver.getFIO());
        }
        for (DriverD driver : driverDList) {
            System.out.println(driver.getFIO());
        }
    }

    public static Set<DriverB> getDriverBList() {
        return driverBList;
    }

    public static Set<DriverC> getDriverCList() {
        return driverCList;
    }

    public static Set<DriverD> getDriverDList() {
        return driverDList;
    }
}
