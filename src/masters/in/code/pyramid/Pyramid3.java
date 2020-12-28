package masters.in.code.pyramid;
/*
Program to print half pyramid using alphabets
AB
ABC
ABCD
ABCDE
*/

public class Pyramid3 {

	public static void main(String[] args) {
		pyramid3();

	}

	private static void pyramid3() {
		for (char c = 'A'; c <= 'E'; c++) {
			for (char ch = 'A'; ch <= c; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
