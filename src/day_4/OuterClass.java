package day_4;

public class OuterClass {

	public static class InnerClass{
		public static int i = 0;
		public static String color = "red";
	}
	
	public static void main(String[] args) {
		System.out.println(InnerClass.i);
		System.out.println(InnerClass.color);
	}
	
}
