package innlevering1;


import static java.lang.Math.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;


public class OppgaveO2 {
	
	public static void main(String [] args) {
		
	for (int runder=1; runder<=10; runder++) {
		
		int inn = parseInt(showInputDialog("Skriv inn poengsum her: "));
		
		
		while (inn<0 || inn>100) {
			inn = parseInt(showInputDialog("Ugyldig poengsum, prøv på nytt: "));
		}
		
		if (inn >= 90 && inn <= 100) {
			showMessageDialog(null," Gratulerer! Du har fått karakter A!");
		} 
		else if (inn >= 80 && inn <= 89) {
			showMessageDialog(null, "Du har fått karakter B!");
		}
		else if (inn >= 60 && inn <= 79) {
			showMessageDialog(null, "Du har fått karakter C!");
		}
		else if (inn >= 50 && inn <= 59) {
			showMessageDialog(null, "Du har fått karakter D!");
		}

		else if (inn >= 40 && inn <= 49) {
			showMessageDialog(null, "Du har fått karakter E!");
		}
		else if (inn >= 0 && inn <= 39) {
			showMessageDialog(null, "Du har fått karakter F!");
		}
		else 
			showMessageDialog(null, "Det har opstått en bug i systemet :)");
		
	}

}

}