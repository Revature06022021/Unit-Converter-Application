package main;

import java.util.Scanner;

public class Converter2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int menuSelection = 0;

		while (menuSelection != 4) {
			
			System.out.println("Please select an option: " + 
				       "\n1. Cups to Teaspoons" + 
					   "\n2. Miles to Kilometers"+ 
					   "\n3. Bytes to Bits" + 
					   "\n4. Quit");

			switch (menuSelection = input.nextInt()) {
			
			case 1:
				int cups = collectQuantityOfCups();
				int cupsToTeaspoons = convertCupsToTeaspoons(cups);
				System.out.println(cups + " cups convert to " + cupsToTeaspoons + " teaspoons.\n");
				break;
				
			case 2:
				double miles = collectQuantityOfMiles();
				double milesToKilometers = convertMilesToKilometers(miles);
				System.out.println(miles + " miles convert to " + milesToKilometers + " kilometers.\n");
				break;
				
			case 3:
				int bytes = collectQuantityOfBytes();
				int bytesToBits = convertBytesToBits(bytes);
				System.out.println(bytes + " bytes convert to " + bytesToBits + " bits.\n");
				break;
				
			case 4:
				System.out.println("Quit");
			}
		}
		input.close();

	}

	/**
	 * The method is for return a random number of cups
	 */
	private static int collectQuantityOfCups() {
		return (int)(Math.random()*10)+1;
	}
	
	/**
	 * The helper method is for converting the cups to teaspoons
	 */
	private static int convertCupsToTeaspoons(int cups) {
		return cups * 48;
	}
	
	/**
	 * The method is for return a random number of miles
	 */
	private static double collectQuantityOfMiles() {
		return Math.random()*10+1;
	}
	
	/**
	 * The helper method is for converting the miles to kilometers
	 */
	private static double convertMilesToKilometers(double miles) {
		return miles * 1.60934;
	}
	
	/**
	 * The method is for return a random number of bytes
	 */
	private static int collectQuantityOfBytes() {
		return (int)(Math.random()*10)+1;
	}
	
	/**
	 * The helper method is for converting the bytes to bits
	 */
	private static int convertBytesToBits(int bytes) {
		return bytes * 8;
	}
}
