package practice;

public class Car {
	// 燃費
	private double fuelCost;
	// 残量
	private double fuelAmout;

	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmout = fuelAmount;
	}

	public void move(int km) {
		System.out.println(km + " km 走ります");
		this.fuelAmout -= (km / fuelCost);
	}

	public double getFuelAmount() {
		return this.fuelAmout;
	}
}