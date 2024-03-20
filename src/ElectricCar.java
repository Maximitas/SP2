public class ElectricCar extends ACar{
    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }
    public int getMaxRangeKm(){
        return maxRange;
    }
    public int getWhPrKm(){
        return ((batteryCapacity*1000/maxRange));

    }

    @Override
    public int getRegistrationFee() {
        double whPrKm = (100/(getWhPrKm()/91.25));

        int fee = 0;
        if (whPrKm >= 20 && whPrKm <= 50) {
            fee = 330;
        } else if (whPrKm >= 15 && whPrKm <= 20) {
            fee = 1050;
        } else if (whPrKm >= 10 && whPrKm <= 15) {
            fee = 2340;
        } else if (whPrKm >= 5 && whPrKm <= 10) {
            fee = 5500;
        } else if (whPrKm < 5) {
            fee = 10470;
        }
        return fee;
    }
    @Override
    public String toString(){
        return "The fee is " + getRegistrationFee() + " kr"
                + "\nModel: " + getModel()
                + "\nRegistration number: " + getRegistrationNumber()
                + "\nThe watt per Km is " + getWhPrKm() + "\n"
                ;
    }
}
