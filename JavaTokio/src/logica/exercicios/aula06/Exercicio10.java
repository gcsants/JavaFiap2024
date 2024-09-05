package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário: R$ ");
        double salarioAtual = sc.nextDouble();

        double percentualAumento;
        double valorAumento;
        double novoSalario;

        if (salarioAtual <= 280.00) {
            percentualAumento = 20;
        } else if (salarioAtual > 280.00 && salarioAtual <= 700.00) {
            percentualAumento = 15;
        } else if (salarioAtual > 700.00 && salarioAtual <= 1500.00) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        valorAumento = (salarioAtual * percentualAumento) / 100;
        novoSalario = salarioAtual + valorAumento;
        
        System.out.println("Salário antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Salário após o aumento: R$ " + novoSalario);
        
        sc.close();
	}
}