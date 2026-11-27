public class Vehicle {
    protected double dailyRate;

    public Vehicle(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double calculateRentalCharge(int rentalDays) {
        return dailyRate * rentalDays;
    }

    public String getVehicleType() {
        return "Vehicle";
    }
}
