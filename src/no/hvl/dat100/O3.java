package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {

		String heltall = showInputDialog("Skriv inn et heltall");
		int n = Integer.parseInt(heltall);

		if (n <= 0) {
			showMessageDialog(null, "Heltallet må være større en 0");
		}

		int fakultet = 1;
		for (int i = 1; i <= n; i++) {
			fakultet *= i;
		}

		System.out.println("Verdien av " + n + "! er: " + fakultet);
	}
}