package projekt4;
/*
 * Polje dimenzija 4x4, 4 brodica velicine po 1 polje, 10 dozvoljenih poteza
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Battleship {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//ispis imena igre, pozivanje metode game
		System.out.println("\nBattleship - brodici\n");	
		game();		
	}
	
	//metoda predstavlja igricu
	public static void game() {
		
		//kreiranje ploce koja ce se prikazivati na ekranu
		String[][] board = boardStrat();
		//ispis ploce
		printBoard(board);
		//kreiranje ploce sa nasumicno generisanim brodicima
		String[][] boardS = generateShips();
		
		//brojac poteza i brojac pogodaka
		int counter = 10;
		int hitCounter = 0;
		
		//petlja dok je brojac poteza veci od 0
		while(counter > 0) {
			//ucitavanje koordinata brodica
			System.out.print("Izaberite red (1-4): ");
			int i = inputCheck()-1;
			System.out.print("Izaberite kolonu (1-4): ");
			int j = inputCheck()-1;
			//provjera da li je pogodak
			if (isCorrect(boardS, i, j)) {
				//ako jeste unesi u plocu koja se prikazuje pogodak i povecati brojac pogodaka
				System.out.println("\nPogodak!");
				board[i][j] = "X";
				hitCounter++;
				//ako je broj pogodaka 4, pogodjeni su svi brodici
				if (hitCounter == 4) {
					//ispisati plocu, izaci iz programa pozivom main metode klase Projekat4
					printBoard(board);
					System.out.println("Cestitamo, pobjedili ste!");
					Projekat4.menu();
				}
			}
			//ako nije bilo pogodka obiljeziti to polje sa "O"
			else {
				board[i][j] = "O";	
				System.out.println("\nPromasaj!");
			}
			//smanijiti broj poteza
			counter--;
			//ispis ploce i preostalih poteza
			printBoard(board);
			System.out.println("Preostalo poteza: "+counter);			
		}
		//ako je broj poteza 0 igrac je izgubio, ispis rasporeda trazenih brodica
		//izaci iz programa pozivom main metode klase Projekat4		
		System.out.println("Izgubili ste!");
		System.out.println("Raspored brodica: ");
		printBoard(boardS);
		Projekat4.menu();

	}
	/**
	 * metoda kreira pocetnu plocu koja se ispisuje na ekranu
	 * @return board
	 */
	public static String[][] boardStrat() {
		//u svako polje upisuje "~"
		String[][] board = new String[4][4];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = "~";
			}
		}
		return board;
	}
	/**
	 * metoda kreira plocu sa postavljenim brodicima
	 * @return boardS
	 */
	public static String[][] generateShips() {
		
		//prvo popuni plocu sa "~"
		String[][] boardS = new String[4][4];
		for (int i = 0; i < boardS.length; i++) {
			for (int j = 0; j < boardS[i].length; j++) {
				boardS[i][j] = "~";
			}
		}
		//pocetne vrijednosti
		int index1 = -1;
		int index2 = -1;
		for (int i = 0; i < 4; i++) {
			//random index1
			index1 = (int)(Math.random()*boardS.length);
			do {
				//random index2 sve dok polje nije zauzeto
				index2 = (int)(Math.random()*boardS[0].length);
			} while (boardS[index1][index2] == "X");
			//upisati u polje "X"
			boardS[index1][index2] = "X";
		}
		return boardS;
	}
	/**
	 * metoda ispisuje plocu na ekran	
	 * @param board ploca koja se ispisuje
	 */
	public static void printBoard(String[][] board) {
		System.out.println();
		//ispis gornje linije sa brojevima
		System.out.println("  1 2 3 4");
		for (int i = 0; i < board.length; i++) {
			//ispis broja redova
			System.out.print(i+1+" ");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	/**
	 * metoda provjerava dali je bio pogodak
	 * @param boardS ploca sa brodovima
	 * @param i koordinate
	 * @param j
	 * @return true ili false
	 */
	public static boolean isCorrect(String[][] boardS, int i, int j) {
		
		return (boardS[i][j] == "X")? true : false;	
	}
	/**
	 * provjera unosa
	 * @return
	 */
	public static int inputCheck() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li u granicama izmedju 1 i 4
				if (unos > 4 || unos < 1) {
					System.out.println("Pogresan unos. Pokusajte ponovo: ");	//ako nije ispisi poruku
					inputCheck = true;
				}				
				else inputCheck = false;	//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}

}
