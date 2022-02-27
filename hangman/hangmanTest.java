package hangman;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class hangmanTest {
	
	Hangman test = new Hangman();
	
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private final ByteArrayOutputStream err = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Test
    void test1() {
		
        boolean testPlayerDead = test.playerDead(true, 0);
        assertSame(true, testPlayerDead);
    }
	
	@Test
	void test2() {
		
		boolean testPlayerWon = test.playerWon(true, true);
		assertEquals(true, testPlayerWon);
	}
	
	@Test
	void test3() {
		
		boolean testPlayerWon = test.playerWon(false, false);
		assertNotEquals(true, testPlayerWon);
	}
	
	@Test
    void test4() {
		
		char[] wordArray = new char[] {'d','o', 'g' };
		char[] letterGuess = new char[] {'_','_', '_' };
		
		boolean match = Arrays.equals(wordArray, letterGuess);
		int testPlayerGuess = test.getPlayerGuess(wordArray, letterGuess, 3, "d");
		
		assertSame(3, testPlayerGuess);
    }

	@Test
    void test5() {
		
		char[] wordArray = new char[] {'d','o', 'g' };
		char[] letterGuess = new char[] {'_','_', '_' };
		
		
		int testPlayerGuess = test.getPlayerGuess(wordArray, letterGuess, 3, "t");

		assertNotSame(3, testPlayerGuess);
    }
	
	@Before
	public void setStreams() {
	    System.setOut(new PrintStream(out));
	    System.setErr(new PrintStream(err));
	}

	@After
	public void restoreInitialStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	void test6() {
		
		char[] wordState = new char[]{'?', '?', '?'};
		for (int i = 0; i < wordState.length; i++) {
			if(wordState[i] == '?') {
				System.out.print(" _");
			}
			else {
				System.out.print(" " + wordState[i]);
			}
		boolean testPrintWordState = test.printWordState(wordState);
		assertNotEquals(wordState[i], out.toString());
		}
	}
	
	@Test
	void test7() {
		
		char[] wordState = new char[]{'?', '?', '?'};
		for (int i = 0; i < wordState.length; i++) {
			if(wordState[i] == '?') {
				System.out.print(" _");
			}
			else {
				System.out.print(" " + wordState[i]);
			}
		boolean testPrintWordState = test.printWordState(wordState);
		assertNotEquals(wordState[i], err.toString());
		}
	}
	
}
