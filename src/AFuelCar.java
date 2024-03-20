public abstract class AFuelCar extends ACar{
    private int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }


    abstract String getFuelType();
    public int getKmPrLitre(){

        return kmPrLitre;
    }

}
