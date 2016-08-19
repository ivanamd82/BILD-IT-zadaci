package projekat3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("\nTic Tac Toe\n");			//ispis imena igre, pozivanje metode game
		game();
	}
	
	//metoda predstavlja igricu
	public static void game() {
		
		char[][] board = new char[3][3];	//matrica koja ce sadrzavati unose od strane korisnika
		int counter = 0;					//brojac koji broji sve poteze, max broj za oba igraca je 9, jer ima 9 polja
		printBoard(board);						//ispis prazne ploce
		boolean win = true;					//kontrolna promjenljiva
		int row, column;					//red,kolona
		
		while(win) {					//sve dok je promjenljiva true igra se izvrsava
			do {						
				System.out.println("Unesite red (0, 1, 2) za igraca X: ");	//unos podataka, provjera da li su 0,1,2 pomocu metode
				row = inputChack();
				System.out.println("unesite kolonu (0, 1, 2) za igraca X: ");
				column = inputChack();
			} while(free(row,column,board));	//provjera da li je polje slobodno pomocu metode, ako nije ponovi unos
			
			board[row][column] = 'X';		//u matricu u odgovarajuce polje upisati unos za igraca "X"
			counter++;						//inkrementirati brojac poteza
			printBoard(board);			//ispisati trenutnu plocu
			
			win = win(board);				//provjera da li je pobjedio igrac, pomocu metode
			
			if(win == false) {				//ako je pobjedio ispis i izlaz iz petlje
				System.out.println("Pobjednik je X.");
				break;	
			}
			if (counter == 9) {					//ako je broj poteza jednak 9, ploca je puna, nerijeseno je
				System.out.println("Nerijeseno.");
				break;
			}
			
			do {
				System.out.print("Unesite red (0, 1, 2) za igraca O: ");	//sve ovo sto je gore i za igraca "O"
				row = input.nextInt();
				System.out.print("Unesite kolonu (0, 1, 2) za igraca O: ");
				column = input.nextInt();
			} while(free(row,column,board));
			
			board[row][column] = 'O';
			counter++;
			printBoard(board);
			
			win = win(board);
			
			if(win == false) {
				System.out.println("Pobjednik je O.");
				break;	
			}
			if (counter == 9) {
				System.out.println("Nerijeseno.");
				break;
			}
			
		}
		Projekat3.menu(); // povratak na glavni meni u klasi Projekat3
	}
	
	//provjera da li je polje zauzeto
	public static boolean free(int row, int column, char[][] board) {
		
		if (board[row][column] == (char)0) {	//ako je polje slobodno vrati false
			return false;
		}
		else {
			System.out.println("Polje je vec zauzeto.");	//ako nije ispisi poruku i vrati true
			return true;
		}
	}
	//ispis trenutne tabele
	public static void printBoard(char[][] board) {
		
		for(int i = 0; i < board.length; i++) {				//petlja ide od prvog do zadnjeg reda
			System.out.println("-------------");			//ispis "linije" na pocetku svakog reda, tj iznad ili kako vec :)
			for(int j = 0; j < board[i].length; j++) {		//petlja za kolone
				System.out.print("| "+board[i][j]+" ");		//ispis | i elementa matrice, ako je prazno ispisace ' '
			}
			System.out.print("|");							//zavrsna |
			System.out.println();						//preskociti u novi red nakon svakog reda
		}
		System.out.println("-------------");		//na kraju ispisati liniju
	}
	//metoda za provjeru pobjede
	public static boolean win(char[][] matrix) {
		
		for(int i = 0; i < matrix.length; i++) {				//provjera po redovima
			if (matrix[i][0] == 'X' || matrix[i][0] == 'O') {					//ako polje nije prazno provjeri da li su svi u redu jednaki
				if(matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix[i][2])
					return false;	
			}
		}														
		for (int j = 0; j < matrix[0].length; j++) {			//provjera po kolonama
			if (matrix[0][j] == 'X' || matrix[0][j] == 'O') {		////ako polje nije prazno provjeri da li su svi u koloni jednaki
				if(matrix[0][j] == matrix[1][j]  && matrix[0][j] == matrix[2][j])
					return false;
			}
		}
		if (matrix[0][0] == 'X' || matrix[0][0] == 'O') {							//provjera dijagonale \
			if (matrix[0][0] ==  matrix[1][1] && matrix[0][0] == matrix[2][2])		//ako polje nije prazno provjeri dijagonalu
				return false;
		}
		if (matrix[0][2] == 'X' || matrix[0][2] == 'O') {							//provjera dijagonale /
			if (matrix[0][2] == matrix[1][1] && matrix[0][2] == matrix[2][0])		//ako polje nije prazno provjeri dijagonalu
				return false;
		}		
		return true;	//ako nema trenutno pobjednika vrati true
	}		
	//metoda za provjeru unosa podataka
	public static int inputChack() {
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li odgovara jednom od ponudjenih 
				if (unos == 0 || unos == 1 || unos == 2)
					inputCheck = false;
				else 				
					System.out.println("Pogresan unos. Pokusajte ponovo: ");	//ako nije ispisi poruku
															
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}
}
