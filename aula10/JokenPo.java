package exercicios;

import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {
		int jogador;
		int computador = (int) (Math.random() * 3 + 1);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos jogar Jokenpo!!");
		System.out.println("1 = Pedra");
		System.out.println("2 = Papel");
		System.out.println("3 = Tesoura");
		System.out.print("Digite sua jogada: ");
		jogador = teclado.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			if (computador == 1) {
				System.out.println("Computador escolheu Pedra");
				System.out.println("Empate!");
				break;
			} else if (computador == 2) {
				System.out.println("Computador escolheu Papel");
				System.out.println("Computador Venceu!");
				break;
			} else if (computador == 3) {
				System.out.println("Computador escolheu Tesoura");
				System.out.println("Você Venceu!");
				break;
			}
		case 2:
			System.out.println("Jogador escolheu Papel");
			if (computador == 1) {
				System.out.println("Computador escolheu Pedra");
				System.out.println("Você Venceu!");
				break;
			} else if (computador == 2) {
				System.out.println("Computador escolheu Papel");
				System.out.println("Empate!");
				break;
			} else if (computador == 3) {
				System.out.println("Computador escolheu Tesoura");
				System.out.println("Você Venceu!");
				break;
			}

		case 3:
			System.out.println("Jogador escolheu Tesoura");
			if (computador == 1) {
				System.out.println("Computador escolheu Pedra");
				System.out.println("Computador Venceu!");
				break;
			} else if (computador == 2) {
				System.out.println("Computador escolheu Papel");
				System.out.println("Você Venceu!");
				break;
			} else {
				System.out.println("Computador escolheu Tesoura");
				System.out.println("Empate!");
				break;
			}
		default:
			System.out.println("Opção inválida");
			break;
		}
		teclado.close();
	}
}
