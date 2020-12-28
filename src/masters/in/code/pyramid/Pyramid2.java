package masters.in.code.pyramid;

/*
Program to print half pyramid using *

*
* *
* * *
* * * *
* * * * *
*/

public class Pyramid2 {

	public static void main(String[] args) {
		pyramid2();
	}

	private static void pyramid2() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
