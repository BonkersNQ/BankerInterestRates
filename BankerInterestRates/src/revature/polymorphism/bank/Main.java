package revature.polymorphism.bank;

public class Main {
	public static void main(String[] args) {
		Bank sbi = new SBI();
		Bank icici = new ICICI();
		Bank axis = new AXIS();
		
		System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest() + "%");
		System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest() + "%");
		System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest() + "%");
	}

}

