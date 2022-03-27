package Runtimes;

public class runtime_2 {
	
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		boolean match = false;
		int guesses = 6;
		
		if(!match) {
			guesses--;
			System.out.println("Wrong letter");
		}
		
		System.out.println("\n" + "Guesses Left: " + guesses);	
		
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		
		System.out.println("\nElapsed execution time in nanoseconds: " + elapsedTime);
		System.out.println("Elapsed execution time in miliseconds: " + elapsedTime / 1000000);
	}
	
}
