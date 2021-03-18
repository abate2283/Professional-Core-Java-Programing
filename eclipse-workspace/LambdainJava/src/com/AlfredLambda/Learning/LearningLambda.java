package com.AlfredLambda.Learning;

import java.util.Arrays;
import java.util.List;

public class LearningLambda {

	public static void main(String[] args) {
		List<Cars> cars = Arrays.asList(
				new Cars("Honda", "Accord", "Red", 23000),
				new Cars("Toyota", "Camry", "White", 25000),
				new Cars("VW", "Passat", "Blue", 24000),
				new Cars("Nissan", "Pathfinder", "Silver", 25000),
				new Cars("Ford", "Explorer", "White", 24000),
				new Cars("GM","Chevy Malibu", "Burgundy", 23000),
				new Cars("Chrysler", "300m", "Blue", 24000),
				new Cars("Land Rover", "Range Rover", "Blue", 45000),
				new Cars("Mercedes", "AMG", "Black", 45000),
				new Cars("Jaguar", "Sports", "Silver", 48000),
				new Cars("Porsche", "Cayenne", "Black", 49000),
				new Cars("Honda", "Accent", "Red", 22300),
				new Cars("Honda", "Pilot", "Blue", 17700),
				new Cars("Toyota", "Land Cruiser", "White", 48500),
				new Cars("Toyota", "Corolla", "Black", 16200),
				new Cars("Toyota", "Camry", "Blue", 24000),
				new Cars("Nissan", "Sentra", "White", 17300),
				new Cars("Mitsubishi", "Lancer", "White", 20000),
				new Cars("Jeep", "Wrangler", "Red", 24500)
				);
		
		//printCarsPriceRange(cars, 18000, 22000);
		//printCarByColor(cars, "Red");
		
		printCars(cars new CarsCondition() {
}
	public static void printCars(List<Cars> cars, CarsCondition condition) {
		for(Cars c: cars) {
		if(condition.test(c)) {
			c.printcar();
		}
			
		}
	}
	public static void printCarsPriceRange(List<Cars> cars, int low, int high) {
		for(Cars c: cars) {
			if(low <= c.getPrice() && c.getPrice() <= high) {
				c.printcar();
			
		}
	}
	}
	public static void printCarByColor(List<Cars> cars, String color) {
		for(Cars c: cars) {
			if(c.getColor().equals(color)) {
				c.printcar();
			}
		}
	}

}
@FunctionalInterface
interface CarsCondition {
	public boolean test(Cars c);
	
}