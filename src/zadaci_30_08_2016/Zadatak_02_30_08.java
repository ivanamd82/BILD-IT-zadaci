package zadaci_30_08_2016;
/* 12.10
 * OutOfMemoryError) Write a program that causes the JVM to throw an 
 * OutOfMemoryError and catches and handles this error.
 */

public class Zadatak_02_30_08 {

	public static void main(String[] args) {
		//pokusava da kreira niz koji ima Integer.MAX_VALUE elemenata, sto prelazi kolicinu memorije koja je dodjeljena JVM
		try {
            int[] temp = new int[Integer.MAX_VALUE];          
        } catch (OutOfMemoryError ex) {
        	System.out.println("OutOfMemoryError");            
        }

	}

}
