package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Trinnskatt {

		public static void main(String[] args) {
			String innTxt = showInputDialog("Hva er din bruttoinntekt ?");
			double inntekt = parseInt(innTxt);
			
			if (inntekt <= 164100) {
				showMessageDialog(null, "Du trenger ikke betale trinnskatt");
			} else if (inntekt>= 164101 && inntekt <= 230950) {
				showMessageDialog(null, "Du må betale " + Math.round(inntekt*0.0093) + " i trinnskatt"); 
			} else if (inntekt >= 230951 && inntekt <= 580650) {
				showMessageDialog(null, "Du må betale " + Math.round(inntekt*0.0241) + " i trinnskatt");  
			} else if (inntekt >= 580651 && inntekt <= 934050) {
				showMessageDialog(null, "Du må betale " + Math.round(inntekt*0.1152) + " i trinnskatt"); 
			} else if (inntekt >= 934051) {
				showMessageDialog(null, "Du må betale " + Math.round(inntekt*0.1452) + " i trinnskatt");  
			}
		}
}
