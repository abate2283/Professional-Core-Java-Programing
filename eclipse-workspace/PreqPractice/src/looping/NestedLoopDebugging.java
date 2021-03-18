package looping;

public class NestedLoopDebugging {

	public static void main(String[] args) {
		int counter = 0;

		for (int i = 0; i <= 100; i++) { // You will have to run code as debugg to see what happens behind the scene.

			System.out.println(i);
			int temp = counter + 1;

			counter = temp;
		}
	}

}
