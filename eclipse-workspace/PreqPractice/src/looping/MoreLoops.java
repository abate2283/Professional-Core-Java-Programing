package looping;

public class MoreLoops {

	public static void main(String[] args) {

		for (int idx = 0; idx < 100; idx++) {

			for (int j = 0; j < 2; j++)

				System.out.println("Value of idx: " + idx + "  What about j?  " + j);

		}
	}

}
