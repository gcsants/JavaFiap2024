package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Qual gênero vc se indentifica?");
		
		System.out.println("[ M ] para Masculino\r\n[ F ] para Feminino\r\n[ O ] Outro\r\n[ N ] Não responder");
		
		char generos;
		generos = 'M' + 'F' + 'O' + 'N';
		
		generos = sc.nextLine().charAt(0);
		System.out.println("Olá " + nome + "," + " o gênero escolhido por vc foi: " + generos);
		
		sc.close();
		
	}

}
