package Generics.vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage<Car> carGarage = new Garage<>();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();

        System.out.println("Enter car name: ");
        String name = keyboardData();
        carGarage.setTransport(new Car(name));

        System.out.println("Enter motorcycle name: ");
        name = keyboardData();
        motorcycleGarage.setTransport(new Motorcycle(name));

        System.out.println("Car - " + carGarage.getTransport().getName());
        System.out.println("Motorcycle - " + motorcycleGarage.getTransport().getName());
    }


    private static String keyboardData() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }
}
