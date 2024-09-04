package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a distancia total percorrida pelo automovel: ");
		double distancia = sc.nextDouble();
		
		System.out.println("Digite o total de combustivel gasto: ");
		double combustivel = sc.nextDouble();
		
		double consumoMedio = distancia / combustivel;
		System.out.printf("Seu automovel faz %.2fkm/Litro\n", consumoMedio);
		if (consumoMedio < 8) {
			System.out.println("Esse carro bebe hein!");
		} else {
			System.out.println("Autonomia legal");
		}
	}

}
