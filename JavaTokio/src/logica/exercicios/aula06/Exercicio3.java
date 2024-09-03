package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		String nota = sc.nextLine();
		int primeiraNota = Integer.parseInt(nota);
		
		System.out.println("Digite a segunda nota do aluno: ");
		String nota2 = sc.nextLine();
		int segundaNota = Integer.parseInt(nota2);
		
		System.out.println("Digite a terceira nota do aluno: ");
		String nota3 = sc.nextLine();
		int terceiraNota = Integer.parseInt(nota3);
		
		System.out.println("Digite a quarta nota do aluno: ");
		String nota4 = sc.nextLine();
		int quartaNota = Integer.parseInt(nota4);
			
		int media =  (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 5) {
			System.out.println("Recuperacao");
		} else if (media < 5) {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}

}
