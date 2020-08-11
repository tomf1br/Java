package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		//vari�veis
		double total, desconto, totalDesconto, valorRecebido, troco;
		//objetos
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat ("#0.00");
		//entrada
		System.out.println("PDV");
		System.out.print("Valor total: ");
		total = teclado.nextDouble();
		System.out.print("Desconto (%): ");
		desconto = teclado.nextDouble();
		//processamento
		totalDesconto = total - ( desconto * total) / 100;
		//sa�da
		System.out.println("Total com desconto:R$" + totalDesconto);
		System.out.print("Valor pago em dinheiro:R$");
		valorRecebido = teclado.nextDouble();
		troco = valorRecebido - totalDesconto;
		System.out.println("Troco: R$" + formatador.format(troco));
		teclado.close();
		

	}

}
