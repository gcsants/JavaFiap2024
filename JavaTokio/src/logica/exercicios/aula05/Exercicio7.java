package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double valorProduto = sc.nextDouble();
		
		System.out.println("Digite o valor a ser pago: ");
		double valorPago = sc.nextDouble();
		
		System.out.println("Seu troco é: " + (valorPago - valorProduto));
		
		sc.close();

	}

}
