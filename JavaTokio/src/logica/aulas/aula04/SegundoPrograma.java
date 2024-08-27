package logica.aulas.aula04;

import java.util.Scanner; 

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Olá, " + nome);
		
		sc.close();
	}

}
