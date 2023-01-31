package carRace.drivers;

import carRace.transport.Bus;

public class DriverD extends Driver<Bus>{
    /*** конструкторы
     * @param FIO
     * @param typeOfLicense
     * @param experience
     * @param typeOfCar***/
    public DriverD(String FIO, Character typeOfLicense, int experience, Bus typeOfCar) {
        super(FIO, typeOfLicense, experience, typeOfCar);
    }
}
