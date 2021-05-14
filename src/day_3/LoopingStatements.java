package day_3;

/**
 * Topic: Conditional Flow
 * 
 * @author Tej
 *
 */
public class LoopingStatements {

	public static void main(String[] args) {
		// for(initialization; stopping condition; increment/decrement value)
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}

		// Break with for
//		for (int i = 0; i < 20; i++) {
//			if (i == 10)
//				break;
//			if (i % 2 == 0)
//				System.out.println(i);
//		}

		// Continue with for
//		for (int i = 0; i < 20; i++) {
//			if (i == 10)
//				continue;
//			if (i % 2 == 0)
//				System.out.println(i);
//		}

		// Confusing but understand code flow
//		for (int i = 0; i < 20; i++) {
//			if (i % 2 == 1) {// 1 3 5 7 9 11
//				System.out.println(i);
//				if (i == 10)
//					break;
//			}
//		}

		// while(stopping condition) - pre-decided while
//		int i = 0;
//		while(i < 20) {
//			System.out.println(i);
//			i++;
//		}

		// while - dynamic condition
//		int j =0;
//		int k = 10;
//		while(j < k) {
//			System.out.println("j: "+j + " k: "+ k);
//			j++;
//			k--;
//		}

		// Do while
//		int i = 0;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i < 20);
	}
}
