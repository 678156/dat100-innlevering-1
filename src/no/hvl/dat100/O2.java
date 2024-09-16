package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int poeng;
			do {
				poeng = Integer.parseInt(showInputDialog("Skriv inn poengsum: "));
				if (poeng < 0 || poeng > 100) {
					System.out.println("Poengsummen er ugyldig, prøv igjen.");
				}

			} while (poeng < 0 || poeng > 100);

			if (poeng >= 90 && poeng <= 100) {
				System.out.println("Karakter: A");
			} else if (poeng >= 80 && poeng <= 89) {
				System.out.println("Karakter: B");
			} else if (poeng >= 60 && poeng <= 79) {
				System.out.println("Karakter: C");
			} else if (poeng >= 50 && poeng <= 59) {
				System.out.println("Karakter: D");
			} else if (poeng >= 40 && poeng <= 49) {
				System.out.println("Karakter: E");
			} else if (poeng >= 0 && poeng <= 39) {
				System.out.println("Karakter: F");
			} else {
				System.out.println("ugyldig poengsum, prøv igjen");
			}
		}
	}
}