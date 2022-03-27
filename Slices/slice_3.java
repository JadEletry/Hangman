package Slices;

// Slice for when the game ends
public class slice_3 {
	
	public static void main(String[] args) {
		
		boolean end = false;
		boolean win = true;
		int guesses = 0;
		
		while (end == false) {
			System.out.println("*********************************");
			if(guesses <= 0) {
				System.out.println("You're dead bozo");
				end = true;
			}
			if(win) {
				System.out.println("Congratulations, you guessed the animal");
				end = true;
			}
			
		}
				
	}
}
