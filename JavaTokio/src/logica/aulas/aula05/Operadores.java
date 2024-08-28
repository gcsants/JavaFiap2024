package logica.aulas.aula05;

public class Operadores {

	public static void main(String[] args) {
		
		float num1 = 5f;
		float num2 = 2f;
		
		System.out.println(num1);
		System.out.println(num2);
		
		float soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		float subtracao = num1 - num2;
		System.out.println("Sub: " + subtracao);
		
		float multiplicacao = num1 * num2;
		System.out.println("Multi: " + multiplicacao);
		
		float divisao = num1/num2;
		System.out.println("Divisao: " + divisao);
		
		float resto = num1 % num2;
		System.out.println("Resto: " + resto);
		
		
		// OPERADORES UNÁRIOS
		
		int numero = 15;
		System.out.println(" ");
		System.out.println(numero);
		
		numero++;
		System.out.println(numero);
		System.out.println(numero++);
		System.out.println(numero);
		System.out.println(++numero);
		
		System.out.println(numero+1);
		System.out.println(numero);
		
		numero--;
		System.out.println(numero);
		
		// OPERADORES DE ATRIBUIÇÃO
		
		int number = 5;
		
		System.out.println(" ");
		System.out.println(number);
		
		number += 7;
		System.out.println(number);
		
	}

}
