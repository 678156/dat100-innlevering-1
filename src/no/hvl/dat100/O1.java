package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {

		double inntekt;
		String inntektTxt = showInputDialog("Skriv inn inntekten din");
		inntekt = Integer.parseInt(inntektTxt);
		double belop = 0;

		if (inntekt >= 1350001) {
			belop += (inntekt - 1350000) * 0.176;
			inntekt = 1350000;
		}
		if (inntekt >= 937901) {
			belop += (inntekt - 937900) * 0.166;
			inntekt = 937900;
		}
		if (inntekt >= 670001) {
			belop += (inntekt - 670000) * 0.136;
			inntekt = 670000;
		}
		if (inntekt >= 292851) {
			belop += (inntekt - 292850) * 0.04;
			inntekt = 292850;
		}
		if (inntekt >= 208051) {
			belop += (inntekt - 208050) * 0.017;

		} else if (inntekt <= 208050 && inntekt > 0) {
			showMessageDialog(null, "Du skal ikke betale trinnskatt for dette beløpet");
		}

		String formatertBelop = String.format("%.2f", belop);
		System.out.println("Du skal betale " + formatertBelop + "kr i skatt.");
	}
}