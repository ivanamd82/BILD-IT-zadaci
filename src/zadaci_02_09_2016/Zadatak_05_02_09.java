package zadaci_02_09_2016;
/*
 * *13.8 (Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform
 * a deep copy of the list field.
 */

public class Zadatak_05_02_09 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//kreiramo objekte
		Object obj1 = new Object();
		Object obj2 = new Object();
		// kreiramo stack
		MyStack stck1 = new MyStack();
		// gurnemo ta dva objekta na stack
		stck1.push(obj1);
		stck1.push(obj2);
		// prikazemo prvi stack
		System.out.println("Stack 1: " + stck1);
		// kloniramo stack
		MyStack stck2 = stck1.clone();
		// prikazemo drugi stack
		System.out.println("Stack 2: " + stck2);
		
	}

}
