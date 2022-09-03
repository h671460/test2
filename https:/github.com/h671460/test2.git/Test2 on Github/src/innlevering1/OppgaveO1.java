package innlevering1;

import static java.lang.Math.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {

		int inntekt = parseInt(showInputDialog("Vennligst skriv inn din inntekt her: "));

		if (inntekt < 164100) {
			showMessageDialog(null, "ingen trinnskatt");
		}

		else if (inntekt < 230951) {

			double skatt = (0.0093) * inntekt;
			showMessageDialog(null, "skatt" + skatt);
		}

		else if (inntekt < 580651) {

			double skatt = (0.0241) * inntekt;
			showMessageDialog(null, "skatt" + skatt);
		} else if (inntekt < 934051) {

			double skatt = (0.1152) * inntekt;
			showMessageDialog(null, "skatt" + skatt);
		} else {

			double skatt = (0.1452) * inntekt;
			showMessageDialog(null, "skatt" + skatt);
		}

	}

}
