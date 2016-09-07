package zadaci_05_09_2016_;

import java.util.Scanner;

public class Zadatak_05_05_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		String num = input.next();
		
		System.out.println(num + " is "+ new RationalBigInteger(num));
		String s = "-1";
		String s1 ="-1.25";
		String s2 = "4/2";
		System.out.println(s+" is "+new RationalBigInteger(s));
		System.out.println(s1+ " is "+new RationalBigInteger(s1));
		System.out.println(s2+ " is " +new RationalBigInteger(s2));
		System.out.println(new RationalBigInteger("0"));
	}

}
