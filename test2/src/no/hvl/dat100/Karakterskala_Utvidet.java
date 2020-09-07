package no.hvl.dat100;
	
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Karakterskala_Utvidet {

		public static void main(String[] args) {	

			for (int studentNr1 = 1; studentNr1 <= 10; studentNr1++) {
					
				String gradeTxt = showInputDialog("Poengsum: ");
				int gradeNumb = parseInt(gradeTxt);
					
				if (gradeNumb < 40 && gradeNumb >= 0) {
					System.out.println("karakter F");
				} else if (gradeNumb < 50 && gradeNumb >= 40) {
					System.out.println("karakter E");
				} else if (gradeNumb < 60 && gradeNumb >= 50) {
					System.out.println("karakter D");
				} else if (gradeNumb < 80 && gradeNumb >= 60) {
					System.out.println("karakter C");
				} else if (gradeNumb < 90 && gradeNumb >= 80) {
					System.out.println("karakter B");
				} else if (gradeNumb <= 100 & gradeNumb >= 90) {
					System.out.println("karakter A");
				}
				else
					showMessageDialog(null, "ugyldig verdi!"); 

		}
		}

	}
