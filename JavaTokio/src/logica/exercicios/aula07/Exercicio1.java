package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String mensagem = "sim";
		
		while(mensagem.equals("sim")) {
			System.out.println("Ola, Mundo!!");
			
			System.out.println("Deseja exibir a mensagem novamente? ");
			mensagem = sc.nextLine();
		}
		
			System.out.println("Fim");
		
			sc.close();
	}

}
