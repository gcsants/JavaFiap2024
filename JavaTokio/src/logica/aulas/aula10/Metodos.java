package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
	static void saudacao() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola, digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.printf("Seja bem vindo ao programa, %s!!", nome);
		}
	
	public static void main(String[] args) {
		
		saudacao();
		
	}

}
