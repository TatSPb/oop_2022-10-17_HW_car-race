package carRace.drivers;

import carRace.Competing;
import carRace.Transport;

import java.util.HashSet;
import java.util.Set;


public abstract class Driver<T extends Transport & Competing> {

    private final String FIO;
    private Character typeOfLicense;
    private int experience;
    private T typeOfCar;




    protected Driver(String FIO, Character typeOfLicense, int experience, T typeOfCar) {
        if (FIO == null || FIO.isEmpty()) {
            throw new NullPointerException("Укажите ФИО водителя");
        } else {
            this.FIO = FIO;
        }

        if (typeOfCar != null) {
            this.typeOfCar = typeOfCar;
        }

        setExperience(experience);
        setTypeOfLicense(typeOfLicense);
    }

    public void startMovement() {
        System.out.println("Водитель " + FIO + " начинает движение " + typeOfCar.getBrand() + " " + typeOfCar.getModel());
    }

    public void stopMovement() {
        System.out.println("Водитель " + FIO + " останавливает движение " + typeOfCar.getBrand() + " " + typeOfCar.getModel());
    }

    public void refuel() {
        System.out.println("Водитель " + FIO + " заправляет " + typeOfCar.getBrand() + " " + typeOfCar.getModel());
    }

    public void driverInfo() {
        System.out.println("Водитель " + getFIO() + " управляет " + typeOfCar.getBrand() + " " + typeOfCar.getModel() + " " +
                "и будет участвовать в заезде.");
    }

    public String getFIO() {
        return FIO;
    }

    public Character getTypeOfLicense() {
        return typeOfLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            throw new NullPointerException("Отсуствует стаж вождения");
        } else {
            this.experience = experience;
        }
    }

    public T getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(T typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public void setTypeOfLicense(Character typeOfLicense) {
        if (typeOfLicense != 'D' && typeOfLicense != 'B' && typeOfLicense != 'C' & typeOfLicense != '0') {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        } else {
            this.typeOfLicense = typeOfLicense;
        }
    }

    @Override
    public String toString() {
        return FIO + ", стаж вождения: " + experience + ", категория прав: " + typeOfLicense;
    }

}
