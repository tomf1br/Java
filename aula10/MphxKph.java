package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MphxKph {

	public static void main(String[] args) {
		double mph,kph;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat ("#0.00");
		System.out.print("Digite a velocidade em MPH:");
		mph = teclado.nextDouble();
		kph = mph*1.60934;
		mph = 1*kph;
		System.out.println("Velocidade em KPH:" + formatador.format(kph));		
		teclado.close();
	}

}
