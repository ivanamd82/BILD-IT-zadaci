package zadaci_20_08_2016;
//test program that measures the execution time of sorting 100,000 numbers using selection sort.

public class TestStopWatch {

	public static void main(String[] args) {
		
		StopWatch time = new StopWatch();		//kreiranje objekta
	
		int[] array = new int[100000];				//kreiranje niza cijelih elemenata
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
		}
		
		time.start();					//postavljanje pocetnog vremena na trenutno vrijeme
		SelectionSort(array);			//sortiranje niza pomocu metode
		time.stop();					//postavljanje krajnjeg vremena
		
		//ispis
		System.out.println("Vrijeme koje je potrebne da racunar sortira niz: "+time.getElapsedTime()+"ms");
	}
	
	//metoda za selektivno sortiranje
	public static void SelectionSort(int[] array) {
		
		for(int i = 0; i < array.length-1; i++) {	
			//pocetne vrijednosti kao trenutni min, i index minimalnog elementa
			int min = array[i];
			int minIndex = i;
			for (int j = 1; j < array.length; j++) {	//poredi sa sl elementom, ako je manji postavi za min, i postavi novi index
				if(array[i] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {				//ako je trenutni min index razlicit od i elementa zamjeni im mjesta
				array[minIndex] = array[i];
				array[i] = minIndex;
			}
		}
	}

}
