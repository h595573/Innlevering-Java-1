package no.hvl.dat100;

import java.util.Scanner;

public class Oppgave6 {

	public static void main(String[] args) {

		Scanner fakultet = new Scanner(System.in);	
		
		int n;
		double totalt = 1;
		double sum = 1;

		System.out.println("Skriv inn et positivtall og så beregner programmt n! av det tallet: ");
		n = fakultet.nextInt();
		
		System.out.print(n);
			for(int i=1; i<n; i++) {
				do {
					System.out.print("*"+(n-i));
				} while (n==1);
			totalt = totalt*i;
			}
			sum = totalt*n;
		
			System.out.println("\n\nn! av " + n + " er " + sum);
	}	
}