package zadaci_08_09_2016;
/*
 * (Maximum element in an array) Implement the following method that returns the
 * maximum element in an array.
 * public static <E extends Comparable<E>> E max(E[] list)
 */

public class Zadatak_03_08_09 {

	public static void main(String[] args) {
		
		//kreiranje liste 
		Integer[] list = new Integer[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random()*10);
            System.out.print(list[i]+" ");
        }
        //ispis
        System.out.println("\nNajveci elemenat u listi: "+max(list));

	}//metoda trazi najveci elemenat u listi
	public static <E extends Comparable<E>> E max(E[] list) {
		//postavlja prvi na najveci
		E max = list[0];
		//ispituje sve i poredi sa max, ako je max manji postavlja novi max
		for (int i = 0; i < list.length; i++) {
			if (max.compareTo(list[i]) < 0) {
				max = list[i];	
			}
		}
		return max;
	
	}

}
