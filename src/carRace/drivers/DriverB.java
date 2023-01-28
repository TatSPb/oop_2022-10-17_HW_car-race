package carRace.drivers;

import carRace.transport.Car;

public class  DriverB extends Driver<Car>{

    /*** конструкторы
     * @param FIO
     * @param typeOfLicense
     * @param experience
     * @param typeOfCar***/
    public DriverB(String FIO, Character typeOfLicense, int experience, Car typeOfCar) {
        super(FIO, typeOfLicense, experience, typeOfCar);
    }
}

