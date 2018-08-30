package nested_loops;

public class forloppsssssss {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			// System.out.println(i);
		}
		for (int i = 100; i >= 0; i--) {
			// System.out.println(i);
		}
		for (int i = 2; i <= 100; i += 2) {
			// System.out.println(i);
		}
		for (int i = 1; i <= 99; i += 2) {
			// System.out.println(i);
		}
		for (int i = 1; i <= 500; i++) {
			// System.out.println(i);

		}
		for (int i = 0; i <= 777; i += 7) {
			// System.out.println(i);
		}
		for (int i = 2005; i <= 2018; i++) {
			// System.out.println(i);
		}
		// nested for loops
		for (int ii = 0; ii < 3; ii++) {

			for (int i = 0; i < 3; i++) {
				// System.out.println(ii+" "+i);
			}
		}
		for (int i = 0; i <= 7; i += 3) {

			for (int ii = 1; ii < 4; ii += 1) {
				//System.out.print(ii + i + " ");

			}
			//System.out.println();
		}
       
		for (int i = 0; i <= 90; i += 10) {

			for (int ii = 1; ii < 11; ii += 1) {
				//System.out.print(ii + i + " ");

			}
			//System.out.println();
		}
		for (int i = 0; i < 7; i += 1) {

			for (int ii = 1; ii < i; ii += 1) {
				//System.out.print("*");

			}
			//System.out.println();
		}
	}
}
