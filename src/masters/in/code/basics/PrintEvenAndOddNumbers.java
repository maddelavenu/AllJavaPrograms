package masters.in.code.basics;

import java.util.Arrays;
import java.util.List;

public class PrintEvenAndOddNumbers {

	static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	public static void main(String[] args) {

		System.out.println("Numbers in a list: " + numbers);
		System.out.println("Even Numbers Are:");
		for (Integer nums : numbers) {
			if (nums % 2 == 0) {
				System.out.print(nums + " ");
			}

		}
		System.out.println();
		System.out.println("Odd Numbers Are:");
		for (Integer nums : numbers) {
			if (nums % 2 != 0) {
				System.out.print(nums + " ");
			}

		}

	}

}
