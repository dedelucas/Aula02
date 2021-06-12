import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
	//Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. Sem usar uma terceira 		  	variável, troque os valores de A e B entre si.
	
		Scanner leitor = new Scanner(System.in);
		
		int a,b;
				
		System.out.println("Digite o primeiro numero inteiro:");
		a = leitor.nextInt();
		
		System.out.println("Digite o segundo numero inteiro");
		b = leitor.nextInt();
		
		System.out.println("O valor de A é igual a " + a + " e o valor de B é igual a " + b);
		
		//trocando os valores da variáveis
		
		a=(a+b);
		b=(a-b);
		a=(a-b);
				
		System.out.println("Trocando os valores temos: A = " + a + " e B = " + b);
		
		
		

	}

}
