package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {
		String nome;
		double peso, altura, imc;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.print("Digite seu nome:");
		nome = teclado.nextLine();
		System.out.print("Digite seu peso:");
		peso = teclado.nextDouble();
		System.out.print("Digite sua Altura em metros:");
		altura = teclado.nextDouble();
		imc = peso / (altura * altura);
		System.out.println("=================");
		System.out.println("Nome:" + nome);
		System.out.println("Seu Imc:" + formatador.format(imc));
		if (imc < 17.00) {
			System.out.println("Muito abaixo do peso");
		} else if (imc >= 17.00 && imc <= 18.49) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc <= 24.99) {
			System.out.println("Peso normal");
		}else if (imc >= 25.00 && imc <= 29.99) {
			System.out.println("Acima do peso");
		}else if (imc >= 30.00 && imc <= 34.99) {
			System.out.println("Obesidade 1");
		}else if (imc >= 35.00 && imc <= 39.99) {
			System.out.println("Obesidade 2 severa");
		}else  {
			System.out.println("Obesidade 3 morbida");
		}
		teclado.close();

	}

}	
