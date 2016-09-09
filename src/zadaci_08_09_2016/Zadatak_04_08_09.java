package zadaci_08_09_2016;
/*
 * 19.6 (Maximum element in a two-dimensional array) Write a generic method that
 * returns the maximum element in a two-dimensional array.
 * public static <E extends Comparable<E>> E max(E[][] list)
 */

public class Zadatak_04_08_09 {

	public static void main(String[] args) {
		
		//kreiranje liste, matrice
		Integer[][] list = new Integer[5][5];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				list[i][j] = (int)(Math.random()*10);
				System.out.print(list[i][j]+" ");
			}
			System.out.println();
		}
		//ispis
		System.out.println("\nNajveci elemenat u listi: "+max(list));
		

	}//pronalazi najveci elemenat u 2d listi
	public static <E extends Comparable<E>> E max(E[][] list) {
		//postavlja prvi kao max
		E max = list[0][0];
		//uzima svaki eleement u listi i poredi sa trenutnim
		//ako je veci on postaje novi max
		for (int i = 0; i < list.length; i ++) {
			for (int j = 0; j < list[i].length; j++) {
				if(max.compareTo(list[i][j]) < 0)
					max = list[i][j];
			}
		}
		//vraca max element
		return max;
	}

}
