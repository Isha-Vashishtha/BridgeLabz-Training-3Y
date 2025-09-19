// Hybrid Inheritance Example 2: Vehicle Management System
// Class Inheritance + Interface Implementation

// Superclass
class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface for refueling capability
interface Refuelable {
    void refuel();
}

// Subclass: Electric Vehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging electric vehicle with battery capacity: " + batteryCapacity + " kWh.");
    }
}

// Subclass: Petrol Vehicle (Implements Interface)
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // in liters

    public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle with capacity: " + fuelCapacity + " liters.");
    }
}

// Driver Class
public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City", 40);

        System.out.println("=== Vehicle Management ===");
        ev.displayInfo();
        ev.charge();

        System.out.println("--------------------------------");
        pv.displayInfo();
        pv.refuel();
    }
}
