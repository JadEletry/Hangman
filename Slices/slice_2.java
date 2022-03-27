package Slices;

// Slice for decrementing and printing remaining number of guesses left
public class slice_2 {
	public static void main(String[] args) {
		
			boolean match = false;
			int guesses = 6;
			
			if(!match) {
				guesses--;
				System.out.println("Wrong letter");
			}
			
			System.out.println("\n" + "Guesses Left: " + guesses);	
	}
}
