package zadaci_08_09_2016;
/*
 * (Generic binary search) Implement the following method using binary search.
public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
 */

public class Zadatak_05_08_09 {

	public static void main(String[] args) {
		//kreiranje liste 
		Integer[] list = new Integer[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
            System.out.print(list[i]+" ");
        }
        //ispis i test metode
        System.out.println();
        System.out.println(binarySearch(list,5));
        System.out.println(binarySearch(list,14));
        
		
		

	}//metoda pronalazi trazeni element
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		//postavlja prvi element kao najmanju vrijednost, i zadnji kao najvecu
		int low = 0;
		int high = list.length - 1;
		//pretraga
		while (high >= low) {
			//srednje element
			int mid = (high + low) / 2;
			//ako je srednji element manji od trazenog postavi novi low
			if (list[mid].compareTo(key) < 0)
				low = mid + 1;
			//ako je srednji element  jednak reazenom vrati index srednjeg elementa
			else if (list[mid].compareTo(key) == 0)
				return mid;
	        else
	        	//ako je srednji veci od trazenog postavi novi high
	        	high = mid - 1;
	        }
		//ako ne nadje trazeni elemenat
	        return -1;
	}

}
