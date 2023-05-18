package Testing.progect.Autopark;

import java.util.HashMap;
import java.util.Map;

public class Car {
    String markaAuto;
    double moshnostAuto;
    int yearOfCreateAuto;

    public Car(String markaAuto, double moshnostAuto, int yearOfCreateAuto) {
        this.markaAuto = markaAuto;
        this.moshnostAuto = moshnostAuto;
        this.yearOfCreateAuto = yearOfCreateAuto;
    }

    public void printCar() {
        String mosh = Double.toString(moshnostAuto);
        String create = Integer.toString(yearOfCreateAuto);
        System.out.printf("Марка машины:\n" + markaAuto + "\nМощность двигателя:\n" + mosh + "\nГод выпуска:\n" + create);
    }
}

class PassengerCar extends Car {
    int numberOfPassengers;
    String repairBook;
    int yearOfChange;

    public PassengerCar(String markaAuto, double moshnostAuto, int yearOfCreateAuto, int numberOfPassengers, String repairBook, int yearOfChange) {
        super(markaAuto, moshnostAuto, yearOfCreateAuto);
        this.numberOfPassengers = numberOfPassengers;
        this.repairBook = repairBook;
        this.yearOfChange = yearOfChange;
    }

    public void RepairBook() {
        Map<String, Integer> repairBook = new HashMap<>();
        repairBook.put("Замена двигателя", 2011);
        repairBook.put("Шиномонтаж", 2015);
        repairBook.put("Замена масла", 2017);
    }


}

class Truck extends Car {
    double maxTonnage;
    String fNameDriver;
    String lNameDriver;
    int weight;

    public Truck(String markaAuto, double moshnostAuto, int yearOfCreateAuto, double maxTonnage, String fNameDriver, String lNameDriver, int weight) {
        super(markaAuto, moshnostAuto, yearOfCreateAuto);
        this.maxTonnage = maxTonnage;
        this.weight = weight;
        this.lNameDriver = lNameDriver;
        this.fNameDriver = fNameDriver;
    }

}

