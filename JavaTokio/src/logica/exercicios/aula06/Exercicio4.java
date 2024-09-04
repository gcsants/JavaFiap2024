package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor inteiro: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor inteiro: ");
		int valor2 = sc.nextInt();
		
		if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
	}

}
