package vehiclerental;

public class Bike extends Vehicle implements Insurable {
    private double insuranceRate;

    public Bike(String vehicleNumber, String type, double rentalRate, double insuranceRate) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate / 100;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Rate: " + insuranceRate + "% for Bike";
    }
}
