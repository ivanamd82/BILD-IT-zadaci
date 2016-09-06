package zadaci_05_09_2016;

import java.util.ArrayList;

public class Zadatak_03_05_09 {

	public static void main(String[] args) {
		
		String[] arg = getArgs(args);
		
		//provjera argumenata
        if (arg.length != 3 || !isValidArgs(arg)) {
            System.out.println("Invalid arguments.");
            System.exit(1);
        }
        //kreiramo objekte
        Rational operand1 = new Rational(arg[0]);
        Rational operand2 = new Rational(arg[2]);
        
        //operacije
        //kreiranje objekta za odgovor
        Rational answer = null;
        //na osnovu znaka operacije iz argumenta izvrsimo odgovarajucu operaciju
        switch (args[1]) {
            case "+": answer = operand1.add(operand2); break;
            case "-": answer = operand1.subtract(operand2); break;
            case "*": answer = operand1.multiply(operand2); break;
            case "/": answer = operand1.divide(operand2); break;
        }
        //ispis 
        System.out.println(operand1 + " " + args[1] + " " + operand2 + " = " + answer);
    }
	//provjerava da su uneseni argumanti ok
    private static boolean isValidArgs(String[] arg) {
    	//ako se prvi broj nalazi u formi broja sa ciframa 0-9
    	//drugi arg je znak - + * ili /
    	//treci kao i prvi
        return  arg[0].matches("[\\d]*[0-9]/[\\d]*[0-9]") &&
                arg[1].matches("[\\-\\+\\*\\/]") &&
                arg[2].matches("[\\d]*[0-9]/[\\d]*[0-9]");
        }
    //metoda uzima argumente i vraca niz String
    private static String[] getArgs(String[] strings) {
        String merged = " ";
        for (String s : strings) {
            merged += " " + s;
        }

        String[] args = merged.split("[\\s ]");
        ArrayList<String> temp = new ArrayList<>();
        // remove blanks
        for (String s : args) {
            if (s.length() != 0) {
                temp.add(s);
            }
        }
        return temp.toArray(new String[temp.size()]);
    }

}