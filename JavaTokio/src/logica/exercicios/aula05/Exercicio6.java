package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome da peça 1: ");
		String peca1 = sc.nextLine();
		
		System.out.print("Qual será a quantidade de " + peca1 + " que voê deseja? ");
		int quantInt1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Digite o valor unitário de " + peca1 + ": ");
		double valor1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("Digite o nome da peça 2: ");
		String peca2 = sc.nextLine();
		
		System.out.print("Qual será a quantidade de " + peca2 + " que voê deseja? ");
		int quantInt2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Digite o valor unitário de " + peca2 + ": ");
		double valor2 = Double.parseDouble(sc.nextLine());
		
		System.out.print("O valor total de " + peca1 + " + " + peca2 + " é: " + ((quantInt1 * valor1) + (quantInt2 * valor2)));
		
		sc.close();
		
	}

}
