package carRace;

import carRace.carParameters.*;
import carRace.drivers.*;
import carRace.transport.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static carRace.drivers.DriverList.driverBList;
import static carRace.drivers.DriverList.printDriverList;


public class Main {
    @Override
    public String toString() {
        return "carRace.Main{}";
    }

    public static void main(String[] args) {

//        Mechanic<Car> bb = new Mechanic<>("Brian", "Birch", "Racing Technology");
//        Mechanic<Truck> dd = new Mechanic<>("David", "Dean", "Best Racing");
//        Mechanic<Transport> ww = new Mechanic<>("Walter", "Waller", "Racing Repair");
//
//        Sponsor redBull = new Sponsor("Red bull", 27_400_000);
//        Sponsor marlboro = new Sponsor("Marlboro", 20_000_000);
//        Sponsor vodafone = new Sponsor("Vodafone", 11_500_000);
//        Sponsor puma = new Sponsor("Puma", 3_160_000);
//
//        Car audiA8 = new Car("Audi", "A8", 3.0, TypeOfBody.COUPE);
////        carRace.transport.Car scodaFabia = new carRace.transport.Car("Scoda", "Fabia", 1.6, carRace.carParameters.TypeOfBody.SEDAN);
////        carRace.transport.Car fiat500C = new carRace.transport.Car("Fiat", "500C", 1.1, carRace.carParameters.TypeOfBody.SEDAN);
////        carRace.transport.Car opelAstra = new carRace.transport.Car("Opel", "Astra", 1.8, carRace.carParameters.TypeOfBody.HATCHBACK);
//
////        carRace.transport.Truck volvoFh16 = new carRace.transport.Truck("Volvo", "FH16", 16.0, carRace.carParameters.TypeOfWeight.N1);
//        Truck kamaz5460 = new Truck("Kamaz", "5460", 12.0, TypeOfWeight.N2);
////        carRace.transport.Truck manTgs = new carRace.transport.Truck("MAN", "TGS", 14.0, carRace.carParameters.TypeOfWeight.N3);
////        carRace.transport.Truck belaz10 = new carRace.transport.Truck("Belaz", "10", 15.0, carRace.carParameters.TypeOfWeight.N1);
//
////        carRace.transport.Bus nefaz5299 = new carRace.transport.Bus("Nefaz", "5299", 11.80, carRace.carParameters.TypeOfCapacity.MEDIUM);
////        carRace.transport.Bus paz3205 = new carRace.transport.Bus("PAZ", "3205", 12.60, carRace.carParameters.TypeOfCapacity.SMALL);
////        carRace.transport.Bus liaz5256 = new carRace.transport.Bus("LIAZ", "5256", 11.15, carRace.carParameters.TypeOfCapacity.EXTRA_LARGE);
//        Bus hyundaiA201 = new Bus("Hyundai", "A201", 13.00, TypeOfCapacity.LARGE);

//        DriverB inp = new DriverB("Иванов Николай Петрович", 'B', 5, audiA8);
//        DriverC kiv = new DriverC("Коломенский Илья Васильевич", 'C', 8, kamaz5460);
//        DriverD niv = new DriverD("Насонов Игорь Валерьевич", 'D', 10, hyundaiA201);

//        audiA8.addDrivers(inp);
//        audiA8.addMechanic(bb);
//        audiA8.addSponsors(redBull);
//
//        kamaz5460.addDrivers(kiv);
//        kamaz5460.addMechanic(dd);
//        kamaz5460.addSponsors(marlboro);
//
//        hyundaiA201.addDrivers(niv);
//        hyundaiA201.addMechanic(ww);
//        hyundaiA201.addSponsors(vodafone, puma);
//
//
//        List<Transport> transports = List.of(audiA8, kamaz5460, hyundaiA201);
//
//        ServiceStation serviceStation = new ServiceStation();
//        serviceStation.addCar (audiA8);
//        serviceStation.addTruck(kamaz5460);
//        serviceStation.service();
//        serviceStation.service();
//        System.out.println();
//
//
//        for (Transport transport : transports) {
//            printInfo3(transport);
//        }

        DriverB pop = new DriverB("Попов Олег Петрович", "B");

        driverBList.addDriverBToList(pop);

        printDriverList();

    }



    private static void printInfo(Driver<?> driver, Transport transport) {
        System.out.println(
                "Водитель " + driver.getFIO() + " "
                        + "управляет " + transport.getBrand() + " " + transport.getModel() + " "
                        + "и будет участвовать в заезде."

        );
        transport.printType();
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " "
                        + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }



    private static void printInfo3(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println();
    }


}


