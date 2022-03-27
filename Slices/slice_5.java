package Slices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


// Slice to show that the user has won
public class slice_5 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
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
		
	}
}
