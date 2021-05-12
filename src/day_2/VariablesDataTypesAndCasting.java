package day_2;

public class VariablesDataTypesAndCasting {


	//static variable
	static int j =0;

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		/**
		 * 1. Types of variables
		 * 2. Data Types
		 */
		// final / constant
		final int i = 0;
		System.out.println("Final/Const Int: "+ i);
		int j = 0;//int data Type
		j = 1;
		System.out.println("Normal Int:"+ j);
		char someThing = 'c'; //char data Type
		System.out.println("Char: "+ someThing);
		
		boolean some = true;//boolean data Type
		System.out.println("Boolean : " +some); 
		
		float tempFloat = (float) 2.23451234567890123456789034567812345678934567893456789; //float data Type
		System.out.println("Float : " +tempFloat);
		
		double tempDouble = (double) 2.234534567890345675678; //double data Type
		System.out.println("Double : " + tempDouble);

		/**
		 * Types Casting
		 * 1. Narrow Casting
		 * 2. Widening Casting
		 */
		// Narrow Casting Example
		tempFloat = (float) tempDouble; // Narrow Casting double -> float
		System.out.println("Narrow Casting double -> float : " + tempFloat);
		j = (int) tempFloat; // Narrow Casting float -> int
		System.out.println("Narrow Casting float -> int : " + j );
	
		// Widening Casting Example
		float tempFloat2 = j;// Widening Casting int -> float 
		System.out.println("Widening Casting int -> float : "+tempFloat2);
		double tempDouble2 = tempFloat2;// Widening Casting float -> double
		System.out.println("Widening Casting float -> double :" + tempDouble2 );

		/**
		 * Operators Example
		 */
		int k = 5;
		int l = 6;
		int s = k %l;//5
		s+=2;//7
		s = s+2;//9
		s++; // s++ is equivalent to s=s+1
		System.out.println(s > k); //boolean output from operators
		System.out.println(s > k && s < k);//boolean output from operators
		
		
		String sampleSting = "String with Escape Char - \' \"";
		System.out.println(sampleSting);
		// String related functions start here
		System.out.println(sampleSting.toLowerCase());
		System.out.println(sampleSting.toUpperCase());
		System.out.println(sampleSting.toUpperCase().indexOf("S"));
		System.out.println(sampleSting.toUpperCase().lastIndexOf("S"));
		// String related functions end here
		System.out.println("TAB ADDED HERE: \tAFTER TAB");//Escape Character - /t Add Tab To Output
		System.out.println("NEW LINE ADDED \nTHIS IS NEW LINE");//Escape Character - /n Add New Line To Output
	}
}
