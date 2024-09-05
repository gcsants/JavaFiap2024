package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tipo de cliente que vc e:\n(1) residencia\n(2) comercio\n(3) industria");
		char cliente = sc.next().charAt(0);
		
		System.out.println("Digite o consumo em KW/h:");
		double consumo = sc.nextDouble();
		
		double valorKwh;
		
		switch (cliente) {
		case '1':
			valorKwh = 0.60;
			break;
		case '2':
			valorKwh = 0.48;
			break;
		case '3':
			valorKwh = 1.29;
			break;
		default:
			System.out.println("Tipo de cliente invalido");
			return;
		}
		double valorTotal = consumo * valorKwh;

        System.out.printf("O valor total da sua conta de luz é: R$%.2f", valorTotal);
        
        sc.close();
	}

}
