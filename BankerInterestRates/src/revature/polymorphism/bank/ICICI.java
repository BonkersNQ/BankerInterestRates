package revature.polymorphism.bank;

public class ICICI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 7.0; // ICICI's rate of interest
    }
}
