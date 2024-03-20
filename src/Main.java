public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();
        ElectricCar el = new ElectricCar("1", "Tesla", "Model S", 5, 103, 531);
        ElectricCar el2 = new ElectricCar("2", "Tesla", "Model 3", 5, 103, 265);

        DieselCar ds = new DieselCar("3", "Kia", "Ting", 5, 15, true);
        DieselCar ds2 = new DieselCar("4", "BMW", "Ting Ting", 5, 35, false);

        GasolinCar gs = new GasolinCar("5", "Toyota", "Omega", 5, 40);
        GasolinCar gs2 = new GasolinCar("6", "Hummer", "Micro", 5, 10);

        fleet.addCar(el);
        fleet.addCar(el2);
        fleet.addCar(ds);
        fleet.addCar(ds2);
        fleet.addCar(gs);
        fleet.addCar(gs2);


        System.out.println(fleet);

    }
}