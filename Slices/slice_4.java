package Slices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Slice for showing the hidden word's current state
public class slice_4 {
	

	public static void main(String[] args) throws FileNotFoundException {

		File animals = new File("D:\\Documents - HDD\\Villain Arc\\Software Quality\\Assignment 1\\src\\hangman\\animals.txt");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(animals);
		
		ArrayList<String> words = new ArrayList<>();
		
		while(scanner.hasNext()) {
			words.add(scanner.nextLine());
		}

		String hiddenWord = words.get((int)(Math.random() * words.size()));
		
		@SuppressWarnings("unused")
		boolean win = true;
		char[] wordArray = hiddenWord.toCharArray();
		char[] wordState = new char[wordArray.length];
		
		for(int i = 0; i < wordArray.length; i++) {
			wordState[i] = '?';
		}
		
		for (int i = 0; i < wordState.length; i++) {
			if(wordState[i] == '?') {
				System.out.print(" _");
				win = false;
			}
			else {
				System.out.print(" " + wordState[i]);
			}
		}
		
		System.out.print(wordState);
		
	}

}
