package looping;

public class QuizzinoLoop {

	public static void main(String[] args) {
		
		
		String name = "asdfghjkqwertyu";
		for ( int i = name.length()-1; i >= 0; i-- ) {
			
			System.out.println("char:" + name.charAt(i));
		}
		
		}
	}


