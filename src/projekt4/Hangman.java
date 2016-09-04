package projekt4;
/*
 * Hangman, test by Mateo and Klara :)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
	
	public static void main(String[] args) {
		
		System.out.println("\nHangman\n");
		game();
		
	}
	public static void game() {
		
		String[] words = {"ivana","dragan","mateo","klara","ivan"};
		String[][] board = boardStrat();
		int missesCount = 0;
		String guess = "";
		String misses = "";
		String guesses = "";
		ArrayList<String> word = new ArrayList<>();
		String secretWord = generateSWord(words);
		word = generateWord(secretWord, word);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pogodi rijec! ");
		printBoard(board);
		
		//System.out.println(word);
				
		while (misses.length() < 13) {
			System.out.print("\nWord:\t");
			printWordList (word);
			System.out.println("\nMisses:\t"+misses);
			System.out.println("Guesses: "+guesses);
			System.out.print("\nUnesite slovo: ");
			guess = input.next().charAt(0)+"";
			if (correctLetter(secretWord,guess)) {
				guesses += guess+" ";
				compareWords(secretWord,word,guess);
				if (win(secretWord,word)) {
					System.out.println("Trazena rijec je "+secretWord);
					System.out.println("Cestitamo, pobjedili ste!");
					Projekat4.menu();
				}
			}
			else {
				misses += " "+guess;
				missesCount++;
				updateBoard(board, missesCount);
			}
			printBoard(board);
						
		}
		System.out.println("Izgubili ste! Trazena rijec je "+secretWord);
		Projekat4.menu();
	}
	public static String[][] boardStrat() {
		
		String board[][] = {{" "," ","_","_","_","_","_"," "},
							{" "," ","|"," "," "," ","|"," "},
							{" "," "," "," "," "," ","|"," "},
							{" "," "," "," "," "," ","|"," "},
							{" "," "," "," "," "," ","|"," "},
							{" "," "," "," "," "," ","|"," "},
							{" "," "," "," "," "," ","|"," "},
							{" "," ","_","_","_","_","|","_"}};
						
		return board;
	}
	public static void printBoard(String[][] board) {
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	public static String generateSWord(String[] words) {
		int i = (int)(Math.random() * words.length);
		return words[i];
	}
	
	public static ArrayList<String> generateWord(String secretWord, ArrayList<String> word) {
		for(int i = 0; i < secretWord.length(); i++) {
			word.add("_ ");
		}
		return word;
	}
	
	public static boolean correctLetter(String secretWord, String guess) {
		if (secretWord.contains(guess))
			return true;
		else return false;
	}
	
	public static void updateBoard(String[][] board, int missesCount) {
		switch(missesCount) {
			case 1: board[2][2] = "O"; break;
			case 2: board[3][2] = "|"; break;
			case 3: board[3][1] = "\\"; break;
			case 4: board[3][3] = "/"; break;
			case 5: board[4][2] = "|"; break;
			case 6: board[5][1] = "/"; break;
			case 7: board[5][3] = "\\"; break;
		}
	}
	public static void compareWords(String secretWord, ArrayList<String> word, String guess) {
		int index = -1;
		int indexStart = 0;
		
		while(indexStart < secretWord.length()) {
			index = secretWord.indexOf(guess, indexStart);
			if(index < 0)
				break;
			else {
				word.set(index, guess);
				indexStart = index + 1;
			}
		}		
	}
	public static void printWordList (ArrayList<String> word) {
		for (int i = 0; i < word.size(); i++) {
			System.out.print(word.get(i)+" ");
		}
	}
	public static String wordListToString(ArrayList<String> word) {
		String wordStr = "";
		for (int i = 0; i < word.size(); i++) {
			wordStr += word.get(i);
		}
		return wordStr;
	}
	public static boolean win(String secretWord, ArrayList<String> word) {
		String wordStr = wordListToString(word);
		if (secretWord.equals(wordStr)) {
			return true;
		}
		return false;
	}

}
