package innlevering1;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {
	public static void main(String[] args) {

		int n = 0;
		
		do {	
			 n = parseInt(showInputDialog("Skriv inn verdi det skal beregnes fakultet for her: "));
		} while (n <= 0); 
			

		int produkt = 1;

		for (int i = 1; i <= n; i++) {
			
			
			produkt *= i;

		}

		showMessageDialog(null, n + " fakultet, er: " + produkt);
	}

}

