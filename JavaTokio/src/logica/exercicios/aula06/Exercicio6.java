package logica.exercicios.aula06;

import java.time.Year;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int anoAtual = Year.now().getValue();
		
		System.out.println("Digite o ano (4 digitos) em que vc nasceu:");
		int anoNasc = sc.nextInt();
				
		int idade = anoAtual - anoNasc;
		
		if (idade >= 18 && idade <= 70) {
			System.out.println("O seu voto e obrigatorio");
		} else if (idade >= 16 && idade < 18 || idade > 70) {
			System.out.println("O seu voto e opcional");
		} else if (idade < 16) {
			System.out.println("O seu voto e proibido");
		}
	}

}
