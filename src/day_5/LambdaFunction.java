package day_5;

import java.util.ArrayList;

public class LambdaFunction {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Tejas");
		arrayList.add("Laukik");
		arrayList.add("Laukik 2");
		arrayList.add("Laukik 3");
		arrayList.add(2, "Some Name"); // inserting element in between 2 elements

		ArrayList<String> arrayList2 = new ArrayList<>();
		
		arrayList.forEach((word) -> {
			if(word.contains("Laukik"))
				arrayList2.add(word);
			}
		);
		
		arrayList2.forEach((word) -> System.out.println(word));

	}
}
