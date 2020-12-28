package masters.in.code;

import java.util.Arrays;
import java.util.List;

public class PrintEvenAndOddNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,10);
		
		printEvenAndOddNumbers(numbers);
		printEvenAndOddNumbersUsingJava8(numbers);
		
		
	}

	private static void printEvenAndOddNumbersUsingJava8(List<Integer> numbers) {
		System.out.println("Print EvenAndOddNumbers Using Java 8");
		numbers.stream().filter(num->num%2==0).forEach(System.out::println);
		
	}

	private static void printEvenAndOddNumbers(List<Integer> numbers) {
		
	}
	
	

}
