package main;

import java.util.Scanner;

public class Converter {

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
				int cups = (int)(Math.random()*10)+1;  // generate a random number from 1 to 10
				int cupsToTeaspoons = cups * 48;
				System.out.println(cups + " cups convert to " + cupsToTeaspoons + " teaspoons.\n");
				break;
				
			case 2:
				double miles = Math.random()*10+1;
				double milesToKilometers = miles * 1.60934;
				System.out.println(miles + " miles convert to " + milesToKilometers + " kilometers.\n");
				break;
				
			case 3:
				int bytes = (int)(Math.random()*10)+1;
				int bytesToBits = bytes * 8;
				System.out.println(bytes + " bytes convert to " + bytesToBits + " bits.\n");
				break;
				
			case 4:
				System.out.println("Quit");
			}
		}
		input.close();
	}
}
