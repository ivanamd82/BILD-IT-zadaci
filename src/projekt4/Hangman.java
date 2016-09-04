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
	//metoda predstavlja igricu
	public static void game() {
		
		//stringovi sa rijecima koje se pogadjaju
		String[] words = {"ivana","dragan","mateo","klara","ivan"};
		
		//kreiranje pocetnog vjesala, matrica sa vjesalom
		String[][] board = boardStrat();
		//brojac promasaja
		int missesCount = 0;
		//trenutno uneseno slovo
		String guess = "";
		//promasaji
		String misses = "";
		//pogodjena slova
		String guesses = "";
		//kriramo listu koja ce ispisivati trazenu rijec sa pogodjenim slovima npr _ _ a
		ArrayList<String> word = new ArrayList<>();
		//generisanje skrivene rijeci pomocu metode
		String secretWord = generateSWord(words);
		//pravi elemente za listu word
		word = generateWord(secretWord, word);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pogodi rijec! ");
		//ispis vjesala 
		printBoard(board);
		
		//pogadja se dok je brojac manji od 13, jer pored mogucih 7 pogresaka, u stringu su dodani i razmaci
		while (misses.length() < 13) {
			//ispis
			System.out.print("\nWord:\t");
			printWordList (word);
			System.out.println("\nMisses:\t"+misses);
			System.out.println("Guesses: "+guesses);
			System.out.print("\nUnesite slovo: ");
			//ucitavanje slova
			guess = input.next().charAt(0)+"";
			//ako je tacno dodati ga strinku sa pogodjenim slovima
			if (correctLetter(secretWord,guess)) {
				guesses += guess+" ";
				compareWords(secretWord,word,guess);
				//provjeriti da li je rijec pogodjena
				if (win(secretWord,word)) {
					//ako jeste ispis poruke i izlazak iz trenutne igre, ispi pocetnog menija iz klase Projekat4
					System.out.println("Trazena rijec je "+secretWord);
					System.out.println("Cestitamo, pobjedili ste!");
					Projekat4.menu();
				}
			}
			//ako nije pogodjeno slovo dodati ga listi promasenih
			else {
				misses += " "+guess;
				//povecati brojac gresaka i sipis vjesala
				missesCount++;
				updateBoard(board, missesCount);
			}
			printBoard(board);
						
		}
		//ispis poruke izlaz
		System.out.println("Izgubili ste! Trazena rijec je "+secretWord);
		Projekat4.menu();
	}
	/**
	 * metoda kreira pocetna vjesala
	 * @return matricu sa praznim vjesalima
	 */
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
	/**
	 * metoda ispisuje vjesala sa trenutnom situacijom
	 * @param board
	 */
	public static void printBoard(String[][] board) {
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	/**
	 * metoda generise trazenu rijec nasumicnim izborom iz niza sa rijecima
	 * @param words
	 * @return vraca skrivenu rijec
	 */
	public static String generateSWord(String[] words) {
		int i = (int)(Math.random() * words.length);
		return words[i];
	}
	
	/**
	 * kreira trenutno stanje rijeci koja se ispisuje, 
	 * pocetno stanje su crtice koje pokazuju koliko ima slova
	 * slova ili crtice su elementi liste
	 * @param secretWord
	 * @param word
	 * @return
	 */
	public static ArrayList<String> generateWord(String secretWord, ArrayList<String> word) {
		for(int i = 0; i < secretWord.length(); i++) {
			word.add("_ ");
		}
		return word;
	}
	
	/**
	 * provjerava da li se slovo nalazi u skrivenoj rijeci
	 * @param secretWord
	 * @param guess
	 * @return
	 */
	public static boolean correctLetter(String secretWord, String guess) {
		if (secretWord.contains(guess))
			return true;
		else return false;
	}
	
	/**
	 * azuriranje vjesala, u zavisnosti od broja gresaka dodati jos jedan dio tijela :)
	 * @param board
	 * @param missesCount
	 */
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
	/**
	 * poredi slovo i trazenu i ispisuje slova na odgovarajucim mjestima
	 * @param secretWord
	 * @param word
	 * @param guess
	 */
	public static void compareWords(String secretWord, ArrayList<String> word, String guess) {
		//pocetne vrijednosti za indekse
		int index = -1;
		int indexStart = 0;
		//petlja dok nije doslo do kraja rijeci
		while(indexStart < secretWord.length()) {
			//pronalazi prvi index slova od startnog indeksa u skrivenoj rijeci
			index = secretWord.indexOf(guess, indexStart);
			//ako je indeks manji od 0; izadji
			if(index < 0)
				break;
			else {
				//postavi u listi na mjesto _ slovo i dodjeliti startnom indeksu vrijednost trenutnog
				word.set(index, guess);
				indexStart = index + 1;
			}
		}		
	}
	/**
	 * ispis rijeci iz liste
	 * @param word
	 */
	public static void printWordList (ArrayList<String> word) {
		for (int i = 0; i < word.size(); i++) {
			System.out.print(word.get(i)+" ");
		}
	}
	/**
	 * konverzija iz liste u string, da bi se rijeci mogle uporediti
	 * @param word
	 * @return
	 */
	public static String wordListToString(ArrayList<String> word) {
		String wordStr = "";
		for (int i = 0; i < word.size(); i++) {
			wordStr += word.get(i);
		}
		return wordStr;
	}
	/**
	 * ako su rijeci jednake - pobjeda
	 * @param secretWord
	 * @param word
	 * @return
	 */
	public static boolean win(String secretWord, ArrayList<String> word) {
		//konvertujemo listu sa slovima rijeci u string i poredimo sa skrivenom rijeci
		String wordStr = wordListToString(word);
		if (secretWord.equals(wordStr)) {
			return true;
		}
		return false;
	}

}
