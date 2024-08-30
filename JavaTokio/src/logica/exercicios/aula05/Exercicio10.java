package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos anos, meses e dias vc tem:");
		
		System.out.print("Anos: ");
		int anos = sc.nextInt();
		
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		System.out.print("Dias: ");
		int dias = sc.nextInt();
		
		int total = (anos * 365) + (meses * 30) + dias; 
		System.out.printf("O seu total de dias vividos é: %d dias", total);
		
		sc.close();
		
	}

}
