package hellopackage;

public class inheritence {

	public static void main(String[] args) {
		Vehiclecompany e = new Vehiclecompany();
		System.out.println(e.companyname);
		System.out.println(e.companytype);
		System.out.println(e.products);
		System.out.println(e.companyname);
		System.out.println(e.companyproduct);
		System.out.println(e.companytype);
		System.out.println(e.price);
		e.run();
		e.stand();
	}
}

class Vehicle {
	// properties
	String companyname = "mahindra/tatamotors";
	String companytype = "manual/automatic";
	String products = "tractor/car";

	// behaviour
	public void run() {
		System.out.println("vehicle is running");
	}

	public void stand() {
		System.out.println("vehicle is standing");

	}
}

class Vehiclecompany extends Vehicle {
	String companyname = "mahindra";
	String companytype = "automatic";
	int price = 700000;
	String companyproduct = "tractor";
}
