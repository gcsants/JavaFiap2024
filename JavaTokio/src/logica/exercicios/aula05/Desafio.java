package logica.exercicios.aula05;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		// Fazer o cálculo contrário do último exercício (Exercício 10)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos dias vividos vc tem: ");
		int diasVividos = sc.nextInt();
		
		sc.close();
		
		int anos = diasVividos / 365;
		
		int meses = (diasVividos % 365) / 30;
		
        int dias = diasVividos % 365 % 30;
       
		System.out.printf("Vc tem %d anos, %d meses e %d dias vividos", anos, meses, dias);
				
	}

}
