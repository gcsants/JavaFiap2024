package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Origem/Estado da carga (1-5): ");
		int estado = sc.nextInt();

		System.out.println("Digite o peso do caminhao em toneladas: ");
		double pesoToneladas = sc.nextDouble();

		System.out.println("Codigo da carga (10-40): ");
		int codCarga = sc.nextInt();

		double pesoKg = pesoToneladas * 1000;

		double precoPorKg = 0;

		if (codCarga >= 10 && codCarga <= 20) {
			precoPorKg = 100;
		} else if (codCarga <= 30) {
			precoPorKg = 250;
		} else if (codCarga <= 40) {
			precoPorKg = 340;
		}

		double impostoPorcentagem = 0;

		if (estado == 1) {
			impostoPorcentagem = 0.35;
		} else if (estado == 2) {
			impostoPorcentagem = 0.25;
		} else if (estado == 3) {
			impostoPorcentagem = 0.15;
		} else if (estado == 4) {
			impostoPorcentagem = 0.05;
		} else if (estado == 5) {
			impostoPorcentagem = 0;
		}

		double precoCarga = pesoKg * precoPorKg;

		double imposto = precoCarga * impostoPorcentagem;

		double valorFinal = precoCarga + imposto;

		System.out.println("Peso da carga em Kg: " + pesoKg);
		System.out.println("Preco da carga: " + precoCarga);
		System.out.println("Valor do imposto: " + imposto);
		System.out.println("Valor final: " + valorFinal);

		sc.close();

	}

}
