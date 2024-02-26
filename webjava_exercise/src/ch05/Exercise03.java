package ch05;

public class Exercise03 {

	public static void main(String[] args) {
		for(int x = 1; x <= 20; x++) {
			for(int y = 1; y <= 20; y++) {
				if((3 * x + 4 *y) < 20) {
					System.out.println("(" + x+", " +y + ")");
				}
			}
		}

	}

}
