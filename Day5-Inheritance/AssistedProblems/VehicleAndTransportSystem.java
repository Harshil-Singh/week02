package AssistedProblems;
public class VehicleAndTransportSystem {

    // Superclass: Vehicle
    abstract static class Vehicle {
        private int maxSpeed;
        private String fuelType;

        // Constructor
        public Vehicle(int maxSpeed, String fuelType) {
            this.maxSpeed = maxSpeed;
            this.fuelType = fuelType;
        }

        // Display vehicle information
        public void displayInfo() {
            System.out.println("Vehicle Info -> Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
        }
    }

    // Subclass: Car
    static class Car extends Vehicle {
        private int seatCapacity;

        // Constructor
        public Car(int maxSpeed, String fuelType, int seatCapacity) {
            super(maxSpeed, fuelType);
            this.seatCapacity = seatCapacity;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Its a Car -> Seat Capacity: " + seatCapacity);
        }
    }

    // Subclass: Truck
    static class Truck extends Vehicle {
        private int loadCapacity;

        // Constructor
        public Truck(int maxSpeed, String fuelType, int loadCapacity) {
            super(maxSpeed, fuelType);
            this.loadCapacity = loadCapacity;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Its a Truck -> Load Capacity: " + loadCapacity + " tons");
        }
    }

    // Subclass: Motorcycle
    static class Motorcycle extends Vehicle {
        private boolean hasSidecar;

        // Constructor
        public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
            super(maxSpeed, fuelType);
            this.hasSidecar = hasSidecar;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Its a Motorcycle -> Sidecar: " + (hasSidecar ? "Yes" : "No"));
        }
    }

    // Main method
    public static void main(String[] args) {
        // Array of Vehicle type to demonstrate polymorphism
        Vehicle[] vehicles = new Vehicle[3];

        // Instantiate objects of subclasses
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(150, "Electric", false);

        // Call displayInfo() for each vehicle
        System.out.println("=== Vehicle Details ===");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("-------------------------");
        }
    }
}
