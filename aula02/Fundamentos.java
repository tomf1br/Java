package cursoJava;

public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade = 15;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arCondicionado = false;
		nome = "Jerry Ferreira";
		System.out.println("Uso de vari�veis na linguagem Java");
		System.out.println("Exemplos: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar condicionado: " + arCondicionado);
		System.out.println("___________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores Aritm�ticos e Atribui");
		System.out.println("Exemplos: ");
		System.out.println("i = " + i);
		System.out.println("i =" + i + " + 5 | i = " + (i + 5));
		System.out.println("i =" + i + " - 5 | i = " + (i - 5));
		System.out.println("i =" + i + " * 5 | i = " + (i * 5));
		System.out.println("i =" + i + " / 5 | i = " + (i / 5));
		System.out.println("i =" + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5      | i = " + (i += 5));
		System.out.println("i -= 5      | i = " + (i -= 5));
		System.out.println("i *= 5      | i = " + (i *= 5));
		System.out.println("i /= 5      | i = " + (i /= 5));
		i++;
		System.out.println("i++         | i = " + i);
		i--;
		System.out.println("i--         | i = " + i);
		System.out.println("___________________________________");
		System.out.println("");
		System.out.println("ESTRUTURAS DE CONTROLE");
		System.out.println("");
		System.out.println("Estruturas de controle condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do 'if'");
		if ( sexo == 'M') {
			System.out.println("Alistamento militar obrigat�rio");
		}
		System.out.println("");
		System.out.println("Exemplo 2 - Uso do 'if - else'");
		if ( idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'else - if'");
		if (idade < 16) {
			System.out.println("Proibido votar");
			}else if (idade > 18 && idade <=70) {
				System.out.println("Voto Obrigat�rio");
			}else  {
				System.out.println("Voto facultativo");
			}
		System.out.println("");
		System.out.println("Exemplo 4 - Uso do 'switch case'");
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. Cadastro de usu�rios");
		System.out.println("3. Relat�rios");
		int opcao = 1;
		switch (opcao) {
		case 1:
			System.out.println("Clientes");
			break;
		case 2:
			System.out.println("Usu�rios");
			break;
		case 3:
			System.out.println("Relat�rios");
			break;
		default:
			System.out.println("Op��o Inv�dida");
			break;
		}
		
		
		
		
	}

}
