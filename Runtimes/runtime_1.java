package Runtimes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Slices.slice_1;

public class runtime_1 extends slice_1{
	public static void main(String[] args) throws FileNotFoundException {
		
		long startTime = System.nanoTime();
			
			File animals = new File("D:\\Documents - HDD\\Villain Arc\\Software Quality\\Assignment 1\\src\\hangman\\animals.txt");
			Scanner scanner = new Scanner(animals);
			ArrayList<String> words = new ArrayList<>();
			
			while(scanner.hasNext()) {
				words.add(scanner.nextLine());
			}
			
			String hiddenWord = words.get((int)(Math.random() * words.size()));
			System.out.println(hiddenWord);
	
		
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		
		System.out.println("\nElapsed execution time in nanoseconds: " + elapsedTime);
		System.out.println("Elapsed execution time in miliseconds: " + elapsedTime / 1000000);
		
		
	}
}
