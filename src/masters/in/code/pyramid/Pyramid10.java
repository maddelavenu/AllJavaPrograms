package masters.in.code.pyramid;

public class Pyramid10 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 10; j > i + 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
