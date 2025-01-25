package vehiclerental;

import java.util.List;

public class VehicleRentalSystem {
    public static void calculateRentalAndInsurance(List<Vehicle> vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = ((Insurable) vehicle).calculateInsurance();

            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Car car = new Car("C1001", "Car", 1000, 5);
        Bike bike = new Bike("B1001", "Bike", 200, 3);
        Truck truck = new Truck("T1001", "Truck", 1500, 7);

        List<Vehicle> vehicleList = List.of(car, bike, truck);
        calculateRentalAndInsurance(vehicleList, 5);  // Calculate rental and insurance for 5 days
    }
}
