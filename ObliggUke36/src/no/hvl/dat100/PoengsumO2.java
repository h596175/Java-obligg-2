package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class PoengsumO2 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			
			String PoengInput = showInputDialog ("Karakter?");
			int PoengSum = Integer.parseInt(PoengInput);
			
		if (90 <= PoengSum && PoengSum <= 100) {
			showMessageDialog (null, "Karakter: A");
			
		}
		else if (80 <= PoengSum && PoengSum <= 89) {
			showMessageDialog (null, "Karakter: B");
			
		}
		else if (60 <= PoengSum && PoengSum <= 79) {
			showMessageDialog (null, "Karakter: C");
			
		}
		else if (50 <= PoengSum && PoengSum <= 59) {
			showMessageDialog (null, "Karakter: D");
			
		}
		else if (40 <= PoengSum && PoengSum <= 49) {
			showMessageDialog (null, "Karakter: E");
			
		}
		else if (30 <= PoengSum && PoengSum <= 39) {
			showMessageDialog (null, "Karakter: F");
			
		}
		else {
			showMessageDialog (null, "Feil input, skriv inn ny gyldig verdi");
			i--;
		}
		
		}
	}

}
