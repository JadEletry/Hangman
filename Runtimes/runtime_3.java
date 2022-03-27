package Runtimes;

public class runtime_3 {
	
public static void main(String[] args) {
		
		long startTime = System.nanoTime();
	
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
		
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		
		System.out.println("\nElapsed execution time in nanoseconds: " + elapsedTime);
		System.out.println("Elapsed execution time in miliseconds: " + elapsedTime / 1000000);		
	}
}
