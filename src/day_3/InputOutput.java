package day_3;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Give me input:");
//		String name = scanner.nextLine();
//		System.out.println("Name: "+ name);
		System.out.println("Give me 1st number as input:");
		float firstNo = scanner.nextFloat();
		System.out.println("Number: " + firstNo);

		System.out.println("Give me 2nd number as input:");
		float secondNo = scanner.nextFloat();
		System.out.println("Number: " + secondNo);

		float c = add(firstNo, secondNo);
		System.out.println("Total: " + c);
	}

	static float add(float a, float b) {
		return a + b;
	}

}
