package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais: ");
		double reais = sc.nextDouble();
		
		System.out.println("Valor em Real: " + reais);
		
		double dolarAmericano = reais / 5.65;
		System.out.printf("Valor em Dólar: %.2f\n", dolarAmericano);
		
		double euro = reais / 6.24;
		System.out.printf("Valor em Euro: %.2f\n", euro);
		
		double pesoArgentino = 0.0059 / reais;
		
		System.out.printf("Valor em Peso Argentino: %.4f\n", pesoArgentino);
		
		double libraEsterlina = 0.14 / reais;
		
		System.out.printf("Valor em Libra Esterlina: %.2f\n", libraEsterlina);
		
		double iene = 25.91 / reais;
		
		System.out.printf("Valor em Iene: %.2f\n", iene);
		
		sc.close();
		
	}

}
