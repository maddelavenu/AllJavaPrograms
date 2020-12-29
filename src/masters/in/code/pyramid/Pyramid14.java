package masters.in.code.pyramid;

/*

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * *

 */

public class Pyramid14 {

	public static void main(String[] args) {

		upPyramid();
		downPyramid();

	}

	private static void downPyramid() {
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void upPyramid() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
