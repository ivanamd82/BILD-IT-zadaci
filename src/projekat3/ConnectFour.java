package projekat3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConnectFour {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\nConnect Four\n");		//ispis imena igrice pozivanje metode game
		game();

	}
	//metoda predstavlja igricu
	public static void game() {
		
		char[][] board = new char[6][7];		//matrica koja ce sadrzavati unose od strane korisnika
		int counter = 0;						//brojac koji broji sve poteze, max broj za oba igraca je 42, jer ima 42 polja	
		boolean win = true;						//kontrolna promjenljiva
		int row, column;						////red,kolona
		
		printBoard(board);				//ispis prazne ploce
		
		while(win) {					////sve dok je promjenljiva true igra se izvrsava
			do{
				System.out.println("Spustite crveni disk na kolonu koju zelite (0–6): ");	//unos podataka, provjera da li je uneseni br kolona 0-6
				column = inputChack();										//pomocu metode
				row = findRow(board,column);							//odredjivanje prvog slobodnom reda u izabranoj koloni pomocu metode
			} while(free(row));					//ako nema slobodnih mjesta ponoviti unos kolone
			
			board[row][column] = 'R';			//u matricu u odgovarajuce polje upisati unos za igraca "R"
			counter++;							//povecati brojac poteza 
			
			printBoard(board);					//ispisati trenutnu plocu
			
			win = win(board);					//provjera da li je pobjedio igrac, pomocu metode
			
			if(win == false) {					//ako je pobjedio ispis i izlaz iz petlje
				System.out.println("Pobjednik je R.");
				break;	
			}
			if (counter == 42) {				//ako je broj poteza jednak 42, ploca je puna, nerijeseno je
				System.out.println("Nerijeseno.");
				break;
			}
			do {
				System.out.println("Spustite zuti disk na kolonu koju zelite (0–6): ");	//isto kao i za gornjeg igraca
				column = inputChack();
				row = findRow(board,column);
			} while(free(row));
			
			board[row][column] = 'Y';
			counter++;
			
			printBoard(board);
			
			win = win(board);	
			
			if(win == false) {
				System.out.println("Pobjednik je Y.");
				break;	
			}
			if (counter == 42) {
			System.out.println("Nerijeseno.");
			break;
			}
		}
		Projekat3.menu();	// povratak na glavni meni u klasi Projekat3
		
	}
	//ispis ploce
	public static void printBoard(char[][] board) {
		
		for(int i = 0; i < board.length; i++) {			//redovi idu od 0-6
			for(int j = 0; j < board[i].length; j++) {	//kolone 0-7
				System.out.print("|"+board[i][j]);		//ispisati | i elemenat matrice, ako je prazno ispisace ' '
			}
			System.out.print("|");			//kad dodje do kraja reda ispisati | i preci u novi red
			System.out.println();
		}
		System.out.println("---------------");		//na kraju ispisati liniju
	}
	//metoda pronalazi prvi slobodan red u izabranoj koloni
	public static int findRow(char[][] board, int column) {	
		
		int row = -1;							//pocetna vrijednost -1
		for (int i = 5; i >= 0; i--) {			//provjeravati u dataoj koloni da li su polja slobodna, petlja ide od zadnjeg reda
			if(board[i][column] == (char)0) {	//tj provjerava se od dole prema vrhu
				row = i;						//kad nadje prvo slobodno mjesto vratiti indeks reda
				break;
			}
		}
		return row;				//ako nema ni jednog slobodnog vraca negativnu vrijednost 
	}
	//metoda provjerava da li je nadjeno mjesto u odgovarajucij koloni
	public static boolean free(int row) { 
		
		if (row < 0) {								//ako je is predhocne kolone vraceno -1 nema ni jednog slobodnog
			System.out.println("Sva polja u tom redu su zauzeta.");
			return true;
		}
		else return false;
			
	}
	//metoda za provjeru pobjede
	public static boolean win(char[][] board) {
		
		for (int i = 5; i >= 0; i--) {				//provjera redova
			int counter = 1;
			for(int j = 0; j < 6; j++){
				if(board[i][j] != (char)0 && board[i][j] == board[i][j+1])	//ako su elemnti jednaki povecati brojac
					counter++;
				else counter = 1;					//ako nisu restartovati brojac
				if (counter == 4)					//ako je brojac = 4 pobjeda
					return false;
			}
		}
		for (int j = 0; j <= 6; j++) {				//provjera kolona
			int counter = 1;
			for(int i = 5; i > 0; i--) {
				if(board[i][j] != (char)0 && board[i][j] == board[i-1][j])
					counter++;
				else counter = 1;
				if (counter == 4)
					return false;
			}
		}
		for (int i = 5; i >= 3; i--) {					//provjera dijagonale /
			for (int j = 0; j <= 4; j++) {
				if (board[i][j] != (char)0 && board[i][j] == board[i-1][j+1] && board[i][j] == board[i-2][j+2]
						&& board[i][j] == board[i-3][j+3])
					return false;
			}
		}
		for(int i = 5; i >= 3; i--){					//provjera dijagonale  \
			for(int j = 3; j <= 6; j++){
				if(board[i][j] != (char)0 && board[i][j] == board[i-1][j-1] && board[i][j] == board[i-2][j-2]
						&& board[i][j] == board[i-3][j-3])
					return false;
			}	
		}					
		return true;		//ako niko nije trenutno pobjedio vrati true
	}
	//metoda za provjeru unesenih podataka
	public static int inputChack() {
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da odgovara ponudjenom broju kolona
				if (unos >= 0 && unos <=6)
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
