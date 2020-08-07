package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		//variáveis
		String nome;
		double nota1,nota2,media;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat ("0.00");
		//Entrada
		System.out.print("Digite seu nome:");		
		nome = teclado.nextLine();
		System.out.print("Digite a nota1:");
		nota1 = teclado.nextDouble();
		System.out.print("Digite a nota2:");
		nota2 = teclado.nextDouble();
		//Processamento
		media = (nota1 + nota2)/2;
		//Saída
		System.out.println("=====================");		
		System.out.println("==Calculo da Média==");
		System.out.println("=====================");
		System.out.println();
		System.out.println("Nome:"+ nome);
		System.out.println("Media:"+ formatador.format (media));
		teclado.close();
		
	}

}
