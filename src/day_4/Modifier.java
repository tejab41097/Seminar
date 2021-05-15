package day_4;

public class Modifier {
	//public
	public int publicVariable = 11;
	//default
	int defaultVariable = 12;
	//private 
	private int privateVariable = 13;
	//protected
	protected int protectedVariable = 14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier modifier = new Modifier();
		System.out.println(modifier.defaultVariable);
		System.out.println(modifier.publicVariable);
		System.out.println(modifier.privateVariable);
		System.out.println(modifier.protectedVariable);
	}
	
	public void printPrivateVariable() {
		System.out.println(privateVariable);
	}
}
