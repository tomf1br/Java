package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorHora {
	// Calculo do valor da hora de serviço:
	// 1- remuneração mensal pretendida: R$6.000.00
	// 2- Acrescentar 30% de impostos (remuneração): R$ 1.800.00
	// 3- Custo operacional: R$ 500.00
	// 4- Investimento: 20% (remuneração) R$ 1.200.00
	// 5- Determinar a carga horária mensal de trabalho: 160 horas/mês
	// valor da hora = ( 6.000 + 1.800 + 500 + 1.200) / 160
	// valor da hora =
	public static void main(String[] args) {
		// variáveis
		double remuneracao, custo,valorHora;
		int cargaHoraria;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Calculo do valor da hora de serviço");
		System.out.print("Remuberação mensal pretendida:R$");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional: R$");
		custo = teclado.nextDouble();
		System.out.print("Carga horária mensal de trabalho: ");
		cargaHoraria = teclado.nextInt();
		//processamento
		valorHora = (remuneracao + (0.3 * remuneracao) + custo + (0.2 * remuneracao)) / cargaHoraria;
		//saída
		System.out.println("Valor da Hora:R$" + formatador.format (valorHora));
		teclado.close();

	}

}
