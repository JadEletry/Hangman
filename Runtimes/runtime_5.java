package Runtimes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class runtime_5 {
public static void main(String[] args) throws FileNotFoundException {
		
		long startTime = System.nanoTime();
	
		File animals = new File("D:\\Documents - HDD\\Villain Arc\\Software Quality\\Assignment 1\\src\\hangman\\animals.txt");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(animals);
		
		ArrayList<String> words = new ArrayList<>();
		
		while(scanner.hasNext()) {
			words.add(scanner.nextLine());
		}

		String hiddenWord = words.get((int)(Math.random() * words.size()));
		
		boolean win = true;
		@SuppressWarnings("unused")
		boolean end = false;
		
		char[] wordArray = hiddenWord.toCharArray();
		char[] wordState = new char[wordArray.length];
		
		for (int i = 0; i < wordState.length; i++) {
			if(wordState[i] == '?') {
				System.out.print(" _");
				win = false;
			}
			else {
				System.out.print("" + wordState[i]);
			}
		}
		
		if(win) {
			System.out.println("Congratulations, you guessed the animal");
			end = true;
		}
		
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		
		System.out.println("\nElapsed execution time in nanoseconds: " + elapsedTime);
		System.out.println("Elapsed execution time in miliseconds: " + elapsedTime / 1000000);	
		
	}
}
