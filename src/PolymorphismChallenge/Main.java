package PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Red Ferrari 296 GTS");
        runRace(car);
        Car ferrari = new GasPoweredCar("2022 Red Ferrari 296 GTS", 6, 15.4);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Blue Tesla Model S", 75, 568);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Red Ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
