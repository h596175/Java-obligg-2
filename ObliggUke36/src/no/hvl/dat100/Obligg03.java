package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Obligg03 {

	public static void main(String[] args) {
		
		String nInput = showInputDialog ("Tall?");
		
		int n = Integer.parseInt(nInput);
		
		int SumResultat = 1;
		
		if (n>0) {
			
		for (int i = 0; i < n; i++) {
			
			SumResultat += SumResultat * i;
				
		}
		showMessageDialog (null, SumResultat);
		}
	}

}
