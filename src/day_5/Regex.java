package day_5;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, Enter Your Phone Number:");
		String phoneNumber = sc.nextLine();
		Boolean regexMatched = phoneNumber.matches("^\\s*(?:\\+?(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$");
		if (regexMatched)
			System.out.println("Validation successfull");
		else
			System.out.println("Validation Failed Please Enter valid Phone Number");
	}

}
