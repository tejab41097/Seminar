package day_3;

import day_4.Modifier;

public class Methods {

	public static void main(String[] args) {

		int a =2;
		int b =3;
		int c = add(a,b);
		System.out.println("c: "+ c);
		
		a = 5;
		b= 4;
		int d = add(a,b);
		System.out.println("d: "+ d);

		//Modifier Example for public variable from Day-4
		Modifier modifier = new Modifier();
//		System.out.println(modifier.defaultVariable);
		System.out.println(modifier.publicVariable);
//		System.out.println(modifier.privateVariable);
//		System.out.println(modifier.protectedVariable);
	}
	
	//scope static/nonstatic return type name(parameters)
	private static int add(int a, int b) {
		// function/method body
		int d = a + b; 
		d = d - a;
		d = d + a;
		return d;
	}

}
