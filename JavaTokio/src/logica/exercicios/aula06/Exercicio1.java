package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Este numero e par");
		} else {
			System.out.println("Este numero e impar");
		}
		
		sc.close();
	}

}
