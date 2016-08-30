package zadaci_24_08_2016;
/* 10.16
 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
 */
import java.math.BigDecimal;

public class Zadatak_01_24_08 {

	public static void main(String[] args) {
		
        String numberStr = "1";		//pocetna vrijednost stringa koji ce predstavljati broj
        for (int i = 0; i < 50; i++)		//kreiranje stringa broja sa 50 cifara
            numberStr += "0";

        BigDecimal number = new BigDecimal(numberStr);		//najmanji broj sa 50 cifara
        
        int counter = 0;							//brojac
        BigDecimal div2 = new BigDecimal("2");		//djelilac - 2
        BigDecimal div3 = new BigDecimal("3");		//djelilac - 3
        
        System.out.println("Prvih 10 brojeva sa 50 decimala koji su djeljivi sa 2 ili 3");
        //sve dok bojac ne dodje do 10 provjeriti da li je broj djeljiv sa 2 i 3, ako jeste ispisati ga
        while(counter < 10) {
        	if(number.remainder(div2).equals(BigDecimal.ZERO) || number.remainder(div3).equals(BigDecimal.ZERO)) {
        		System.out.println(number+" ");
        		counter++;
        	}
        	number = number.add(BigDecimal.ONE);	//povecati broj za 1
        }        
	}
}
