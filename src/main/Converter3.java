///////////////////////////////////////////////////////////////////////////////////////
//
//Title: Unit Converter Application
//Date:  6/6/2021
//Author: Quming Wang
//
//////////////////////////////////////////////////////////////////////////////////////

package main;

import java.util.Scanner;

public class Converter3 {

	public static void main(String[] args) {

		Converter3 c = new Converter3(); // create a class type object
		Scanner input = new Scanner(System.in); // create a scanner class for obtain inputs
		int menuSelection = 0;

		// the while loop for executing the menu selections
		while (menuSelection != 5) {

			System.out.println("Please select an option: " + 
							   "\n1. Volume Conversions" + 
							   "\n2. Distance Conversions" + 
							   "\n3. Digital Storage Conversions" + 
							   "\n4. Temperature Conversions" + 
							   "\n5. Quit");

			double rand = Math.random() * 10 + 1; // returns a random double type from 1.0 to 10.999

			switch (menuSelection = input.nextInt()) { // the selected option by user input

			case 1:
				if (rand < 5) {
					int cups = (int) rand;
					c.convertCupsToTeaspoons(cups);
				} else {

					int tableSpoons = (int) rand;
					c.convertTablepoonsToTeaspoons(tableSpoons);
				}
				break;

			case 2:
				if (rand > 5) {
					double miles = (int) rand;
					c.convertMilesToKilometers(miles);
				} else {
					int meters = (int) rand;
					c.convertMetersToCentimeters(meters);
				}
				break;

			case 3:
				if (rand > 5) {
					int bytes = (int) rand;
					c.convertBytesToBits(bytes);
				} else {
					int kiloBits = (int) rand;
					c.convertKilobitsToBits(kiloBits);
				}
				break;

			case 4:
				if (rand < 5) {
					int celsius = (int) rand;
					c.convertCelsiusToFahrenheit(celsius);
				} else {
					int kelvin = (int) rand;
					c.covertKelvinToCelsius(kelvin);
				}

				break;
			case 5:
				System.out.println("Quit");
			}
		}
		input.close();

	}

	/**
	 * The method is for converting Celsius to Fahrenheit
	 */
	private void convertCelsiusToFahrenheit(int celsius) {
		int celsiusToFahrenheit = (celsius * 9 / 5) + 32; // the formula converts celsius to fahrenheit
		System.out.println(celsius + "°C convert to " + celsiusToFahrenheit + "°F.\n");
	}

	/**
	 * This method is for converting Kelvin to Celsius
	 */
	private void covertKelvinToCelsius(int kelvin) {
		kelvin = (int)(Math.random()*200)+100; // return a random number from 100 to 300
		int kelvinToCelsius = (int)(kelvin - 273.15); // 0 degree Celsius is equal to 273.15 degrees Kelvin
		System.out.println(kelvin + "K convert to " + kelvinToCelsius + "°C.\n");

	}

	/**
	 * The method is for converting the tablespoons to teaspoons
	 */
	private void convertTablepoonsToTeaspoons(int tableSpoons) {
		int tablespoonsToTeaspoons = tableSpoons * 3; // calculate the distance conversion, there 1tbsp=3tsp
		System.out.println(tableSpoons + " tablespoons convert to " + tablespoonsToTeaspoons + " teaspoons.\n");

	}

	/**
	 * The method is for converting the cups to teaspoons
	 */
	private void convertCupsToTeaspoons(int cups) {
		int cupsToTeaspoons = cups * 48; // Calculating the distance conversion, there 1c = 48tsp
		System.out.println(cups + " cups convert to " + cupsToTeaspoons + " teaspoons.\n");
	}

	/**
	 * The method is for converting the meters to centimeters
	 */
	private void convertMetersToCentimeters(int meters) {
		int metersToCentimeters = meters * 100; // Calculating the conversion, there 1m=100cm
		System.out.println(meters + " meters convert to " + metersToCentimeters + " centimeters.\n");
	}

	/**
	 * The method is for converting the miles to kilometers
	 */
	private void convertMilesToKilometers(double miles) {
		double milesToKilometers = miles * 1.60934; // Calculate the conversion, where 1mi=1.60934km
		System.out.println(miles + " miles convert to " + milesToKilometers + " kilometers.\n");
	}

	/**
	 * The method is for converting the kilobits to bits
	 */
	private void convertKilobitsToBits(int kiloBits) {
		int kilobitsToBits = kiloBits * 1000; // calculating the conversion, there 1b = 1000kb
		System.out.println(kiloBits + " kilobits convert to " + kilobitsToBits + " bits.\n");
	}

	/**
	 * The method is for converting the bytes to bits
	 */
	private void convertBytesToBits(int bytes) {
		int bytesToBits = bytes * 8; // Calculate the digital storage conversion, there 1B=8b
		System.out.println(bytes + " bytes convert to " + bytesToBits + " bits.\n");
	}

}
