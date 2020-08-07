package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {
		String nome;
		double peso,altura,imc;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat ("#0.00");
		System.out.print("Digite seu nome:");
		nome = teclado.nextLine();
		System.out.print("Digite seu peso:");
		peso = teclado.nextDouble();
		System.out.print("Digite sua Altura em metros:");
		altura = teclado.nextDouble();
		imc = peso / (altura * altura);
		System.out.println("=================");
		System.out.println("Nome:" + nome);
		System.out.println("Seu Imc:" + formatador.format (imc));
		teclado.close();
				

	}

}
