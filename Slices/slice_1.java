package Slices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Slice for grabbing a random animal from the animal.txt file
public class slice_1 { 
	
	public static void main(String[] args) throws FileNotFoundException {
			
			File animals = new File("D:\\Documents - HDD\\Villain Arc\\Software Quality\\Assignment 1\\src\\hangman\\animals.txt");
			Scanner scanner = new Scanner(animals);
			ArrayList<String> words = new ArrayList<>();
			
			while(scanner.hasNext()) {
				words.add(scanner.nextLine());
			}
			
			String hiddenWord = words.get((int)(Math.random() * words.size()));
			System.out.println(hiddenWord);
	}
}
