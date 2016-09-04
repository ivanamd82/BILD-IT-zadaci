package projekt4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Battleship {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("\nBattleship - brodici\n");			//ispis imena igre, pozivanje metode game
		game();		
	}
	
	//metoda predstavlja igricu
	public static void game() {
		
		String[][] board = boardStrat();
		printBoard(board);
		String[][] boardS = generateShips();
	
		int counter =10;
		int hitCounter = 0;
				
		while(counter > 0) {
			System.out.print("Izaberite red (1-4): ");
			int i = inputCheck()-1;
			System.out.print("Izaberite kolonu (1-4): ");
			int j = inputCheck()-1;
			if (isCorrect(boardS, i, j)) {
				System.out.println("\nPogodak!");
				board[i][j] = "X";
				hitCounter++;
				if (hitCounter == 4) {
					printBoard(board);
					System.out.println("Cestitamo, pobjedili ste!");
					Projekat4.menu();
				}
			}
			else {
				board[i][j] = "O";	
				System.out.println("\nPromasaj!");
			}
			counter--;
			printBoard(board);
			System.out.println("Preostalo poteza: "+counter);			
		}
		System.out.println("Izgubili ste!");
		System.out.println("Raspored brodica: ");
		printBoard(boardS);
		Projekat4.menu();

	}
	public static String[][] boardStrat() {
		
		String[][] board = new String[4][4];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = "~";
			}
		};
		return board;
	}
	
	public static String[][] generateShips() {
		
		String[][] boardS = new String[4][4];
		for (int i = 0; i < boardS.length; i++) {
			for (int j = 0; j < boardS[i].length; j++) {
				boardS[i][j] = "~";
			}
		}
		int index1 = -1;
		int index2 = -1;
		for (int i = 0; i < 4; i++) {
			index1 = (int)(Math.random()*boardS.length);
			do {
				index2 = (int)(Math.random()*boardS[0].length);
			} while (boardS[index1][index2] == "X");
			boardS[index1][index2] = "X";
		}
		return boardS;
	}
		
	public static void printBoard(String[][] board) {
		System.out.println();	
		System.out.println("  1 2 3 4");
		for (int i = 0; i < board.length; i++) {
			System.out.print(i+1+" ");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static boolean isCorrect(String[][] boardS, int i, int j) {
		if (boardS[i][j] == "X")
			return true;
		return false;
	}
	
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
