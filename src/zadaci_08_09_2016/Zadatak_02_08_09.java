package zadaci_08_09_2016;
/*
 * 19.4 (Generic linear search) Implement the following generic method for linear search.
 * public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 */

public class Zadatak_02_08_09 {

	public static void main(String[] args) {
		
		//kreiranje liste 
		Integer[] list = new Integer[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        //ispis pozicija
        System.out.println(linearSearch(list, 2));
        System.out.println(linearSearch(list, 11));
        System.out.println(linearSearch(list, 30));		

	}
	//
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		//pretrazuje sve elemente liste i ako nadje elemenat koji odgovara trazenom vraca poziciju
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(key) == 0) {	
				return i;
			}
		}
		//inace vraca -1
		return -1;
	}

}
