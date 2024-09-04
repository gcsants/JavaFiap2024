package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Digite a operacao matematica que deseja fazer:\n(+) para somar\n(-) para subtrair\n(*) para multiplicar\n(/) para dividir");
		char operacao = sc.next().charAt(0);
		
		double resultado = 0;
		
		switch (operacao) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			} 
	
			System.out.println("O resultado e: " + resultado);
			
			sc.close();
	}

}
