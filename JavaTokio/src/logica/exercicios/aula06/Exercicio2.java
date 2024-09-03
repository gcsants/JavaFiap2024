package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("O numero " + num1 + " e o maior");
		} else if (num1 < num2) {
			System.out.println("O numero " + num2 + " e o maior");
		} else if (num1 == num2) {
			System.out.println("Os numeros sao iguais");
		}
		
		sc.close();

	}

}
