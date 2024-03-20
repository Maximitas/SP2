import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet = new ArrayList<>();


    public void addCar(Car car){
        fleet.add(car);

    }
    public int getTotalRegistrationFeeForFleet(){
        int totalfee = 0;
        for (Car car: fleet){
            totalfee += car.getRegistrationFee();
        }
        return totalfee;
    }
    @Override
    public String toString(){
        for (Car car: fleet){
            System.out.println(car);
        }

        return "The total cost is " + getTotalRegistrationFeeForFleet() + " kr";
    }
}
