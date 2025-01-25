package ridehailing;

public class RideHailingSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("V123", "John Doe", 10);
        Vehicle bike = new Bike("V456", "Jane Smith", 5);
        Vehicle auto = new Auto("V789", "Mike Johnson", 7);

        System.out.println("Car Fare for 10 km: $" + car.calculateFare(10));
        System.out.println("Bike Fare for 10 km: $" + bike.calculateFare(10));
        System.out.println("Auto Fare for 10 km: $" + auto.calculateFare(10));
    }
}
