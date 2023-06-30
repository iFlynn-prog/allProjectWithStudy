package Testing.progect.test4;

import java.util.Random;

public class Task {
    public static void main(String[] args) {
        Car car1 = new Car();
        Random random = new Random();
        random.nextInt(1, 5);
        System.out.println("car1 speed = " + car1.speed);
        System.out.println(car1.speed);
    }
}

class Vehicle {
    int speed;
    String model;
    int number_of_wheels;

    {
    speed = 1500;
    number_of_wheels =4;
    }
}
class Car extends Vehicle {
    Boolean musicExists;


    public Car() {

    }
}

class Scooter extends Vehicle {
    int number_of_breaks;
}

