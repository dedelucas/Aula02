import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Para um ano de nascimento fornecido pelo usuário, informe a idade que ele terá no dia 31 de 		dezembro de 2021. */
		
		Scanner leitor = new Scanner(System.in);
		
		int anonascimento;
		int subtracao;
		
		System.out.println("Digite o ano do seu nascimento:");
		anonascimento = leitor.nextInt();
		
		//Calculando a idade em 31 dezembro de 2021
		
		subtracao = 2021 - anonascimento;
		
		if (subtracao < 0) {
			System.out.println("Você ainda nao nasceu!!");
		}else {		
			System.out.println("A sua idade em 31 de dezembro de 2021 será: " + subtracao);
		}
		
		leitor.close();

	}

}
