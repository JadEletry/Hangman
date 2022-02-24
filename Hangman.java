package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// This is a Hangman program that runs off a full list of animals in a txt file

public class Hangman {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Welcome to Hangman!\nGuess the letter of an animal");
		
		File animals = new File("D:\\Documents - HDD\\Villain Arc\\Software Quality\\Assignment 1\\src\\hangman\\animals.txt");
		Scanner scanner = new Scanner(animals);
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList<>();
		
		while(scanner.hasNext()) {
			words.add(scanner.nextLine());
		}
		
		String hiddenWord = words.get((int)(Math.random() * words.size()));

		char[] wordArray = hiddenWord.toCharArray();
		char[] wordState = new char[wordArray.length];
		
		for(int i = 0; i < wordArray.length; i++) {
			wordState[i] = '?';
		}
		
		boolean end = false;
		int guesses = 6;
		
		while (end == false) {
			System.out.println("*************************");
			
			String letter = keyboard.next();
			// Check for invalid input
			while (letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
				System.out.println("Invalid guess, try again");
				letter = keyboard.next();
			}
			
			guesses = getPlayerGuess(wordArray, wordState, guesses, letter);
			boolean win = printWordState(wordState);
			System.out.println("\n" + "Guesses Left: " + guesses);	
			printHangman(guesses);
			
			end = playerWon(end, win);
			end = playerDead(end, guesses);			
		}
		
		System.out.println("The animal was: " + hiddenWord);
	}

	public static boolean playerDead(boolean end, int guesses) {
		if(guesses <= 0) {
			System.out.println("You're dead bozo");
			end = true;
		}
		return end;
	}

	public static boolean playerWon(boolean end, boolean win) {
		if(win) {
			System.out.println("Congratulations, you guessed the animal");
			end = true;
		}
		return end;
	}

	public static boolean printWordState(char[] wordState) {
		boolean win = true;
		for (int i = 0; i < wordState.length; i++) {
			if(wordState[i] == '?') {
				System.out.print(" _");
				win = false;
			}
			else {
				System.out.print("" + wordState[i]);
			}
		}
		return win;
	}

	public static int getPlayerGuess(char[] wordArray, char[] wordState, int guesses, String letter) {
		// Valid input found
		boolean valid = false;
		for(int i = 0; i < wordArray.length; i++) {
			if (letter.charAt(0) == wordArray[i]) {
				wordState[i] = wordArray[i];
				valid = true;
			}
		}
		if(!valid) {
			guesses--;
			
			System.out.println("Wrong letter");
		}
		return guesses;
	}
	
	public static void printHangman(int wrong) {
		  if(wrong == 6) {
		   System.out.println("|----------");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else if(wrong == 5) {
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else if(wrong == 4) {
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|    |");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else if(wrong == 3) {
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|   -|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else if(wrong == 2) {
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|   -|-");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else if(wrong == 1) {
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|   -|-");
		   System.out.println("|   /");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else{
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|   -|-");
		   System.out.println("|   / \\");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		}
	}
