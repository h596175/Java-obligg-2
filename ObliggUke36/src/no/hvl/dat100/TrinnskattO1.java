package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class TrinnskattO1 {

	public static void main(String[] args) {
		
		String BruttoInput = showInputDialog ("Bruttolønn?");
		
		double BruttoPenger = Double.parseDouble(BruttoInput);
		
		if (BruttoPenger <= 164100) {
			BruttoPenger = BruttoPenger*0;
			showMessageDialog (null, "Trinnskatt: " + BruttoPenger);
		} 
		
		else if (164100 < BruttoPenger && BruttoPenger <= 230950) {
			BruttoPenger = BruttoPenger*0.93/100;
			showMessageDialog (null, "Trinnskatt: " + BruttoPenger);
		}
		else if (230950 < BruttoPenger && BruttoPenger <= 580650) {
			BruttoPenger = BruttoPenger*2.41/100;
			showMessageDialog (null, "Trinnskatt: " + BruttoPenger);
		}
		else if (580650 < BruttoPenger && BruttoPenger <= 934050) {
			BruttoPenger = BruttoPenger*11.52/100;
			showMessageDialog (null, "Trinnskatt: " + BruttoPenger);
		}
		else if (934050 < BruttoPenger) {
			BruttoPenger = BruttoPenger*14.52/100;
			showMessageDialog (null, "Trinnskatt: " + BruttoPenger);
		}
	}

}
