package ch05.chocolate;

public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoilerSingleton boiler = ChocolateBoilerSingleton.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoilerSingleton boiler2 = ChocolateBoilerSingleton.getInstance();
		System.out.println(boiler2 == boiler);
	}
}
