package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Karakterskala {

	public static void main(String[] args) {
		String gradeTxt = showInputDialog("Poengsum: ");
		int gradeNumb = parseInt(gradeTxt);
		
		if (gradeNumb < 40 && gradeNumb >= 0) {
			showMessageDialog(null, "karakter F");
		} else if (gradeNumb < 50 && gradeNumb >= 40) {
			showMessageDialog(null, "karakter E");
		} else if (gradeNumb < 60 && gradeNumb >= 50) {
			showMessageDialog(null, "karakter D");
		} else if (gradeNumb < 80 && gradeNumb >= 60) {
			showMessageDialog(null, "karakter C");
		} else if (gradeNumb < 90 && gradeNumb >= 80) {
			showMessageDialog(null, "karakter B");
		} else if (gradeNumb <= 100 & gradeNumb >= 90) {
			showMessageDialog(null, "karakter A");
		}
		else 
			showMessageDialog(null, "ugyldig verdi!");

	}

}