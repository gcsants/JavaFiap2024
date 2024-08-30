package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 999: ");
		int num = sc.nextInt();
		
		int centena = (num / 100) * 100;
	    int dezena =  (num % 100) / 10 * 10;
	    int unidade = (num % 10);
		System.out.println("Centena = " + centena);
		System.out.println("Dezena = " + dezena);
		System.out.println("Unidade = " + unidade);
		
		sc.close();
	}

}
