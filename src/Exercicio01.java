import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos, solicite ao usu�rio que digite o tempo de um filme em minutos e informe a dura��o desse filme em horas e em segundos */
		
		Scanner leitor = new Scanner(System.in);
		
		int tempofilme;
		double horas;
		double segundos;
		
		System.out.println("Favor digitar o tempo do filme em minutos:");
		tempofilme = leitor.nextInt();
		
		//Calculando do tempo do filme em horas e em segundos
		
		segundos = tempofilme * 60;
		horas = segundos / 3600;
		
		if (tempofilme < 0) {
			System.out.println("voc� digitou um tempo inv�lido!!");
		}else {		
			System.out.println("O fime tem dura��o de: " + segundos + " segundos!");
			System.out.println("O fime tem dura��o de: " + horas + " horas!");
		}
		
		leitor.close();

	}

}
