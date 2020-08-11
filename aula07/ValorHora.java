package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorHora {
	// Calculo do valor da hora de servi�o:
	// 1- remunera��o mensal pretendida: R$6.000.00
	// 2- Acrescentar 30% de impostos (remunera��o): R$ 1.800.00
	// 3- Custo operacional: R$ 500.00
	// 4- Investimento: 20% (remunera��o) R$ 1.200.00
	// 5- Determinar a carga hor�ria mensal de trabalho: 160 horas/m�s
	// valor da hora = ( 6.000 + 1.800 + 500 + 1.200) / 160
	// valor da hora =
	public static void main(String[] args) {
		// vari�veis
		double remuneracao, custo,valorHora;
		int cargaHoraria;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Calculo do valor da hora de servi�o");
		System.out.print("Remubera��o mensal pretendida:R$");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional: R$");
		custo = teclado.nextDouble();
		System.out.print("Carga hor�ria mensal de trabalho: ");
		cargaHoraria = teclado.nextInt();
		//processamento
		valorHora = (remuneracao + (0.3 * remuneracao) + custo + (0.2 * remuneracao)) / cargaHoraria;
		//sa�da
		System.out.println("Valor da Hora:R$" + formatador.format (valorHora));
		teclado.close();

	}

}
