package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("A média ponderada do aluno é: " + ((nota1 * 0.4) + (nota2 * 0.6)));
		
		sc.close();
		
	}

}