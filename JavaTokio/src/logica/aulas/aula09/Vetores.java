package logica.aulas.aula09;

import java.util.Iterator;

public class Vetores {

	public static void main(String[] args) {
		
		int[] vetorInteiros = new int [10];
		
		vetorInteiros[0] = 10;
		vetorInteiros[1] = 1999;
		
		System.out.println("Valor inteiro na posicao 0: " + vetorInteiros[0]);
		
		int anoNascimento = vetorInteiros[1];
		System.out.println("Ano nascimento: " + anoNascimento);
		
		int posicao = 0;
		System.out.println(vetorInteiros[posicao]);
		
		// -------------------------------------------------------------------
		
		String[] listaFrutas = new String[4];
		
		listaFrutas[0] = "Morango";
		listaFrutas[1] = "Uva";
		listaFrutas[2] = "Pera";
		listaFrutas[3] = "Tomate";
		
		System.out.println();
		System.out.println("Fruta Pos 1: " + listaFrutas[1]);
		
		// OUTRO JEITO DE DECLARAR LISTAS!!!
		
		String[] listaFrutas2 = {"Melancia", "Abacaxi", "Pitaia", "Banana"};
		
		int qtdFrutas = listaFrutas2.length;
		System.out.println("Qtd de frutas: " + qtdFrutas);
		
		for (int i = 0; i < listaFrutas2.length; i++) {
			System.out.println(listaFrutas2[i]);
		}
		
		// CRIAR UMA LISTA DE NUMEROS
		
		int[] numeros = {16, 24, 29, 33};
		
		// FOR EACH --> percorre a lista e acessa os valores das posicoes
		
		System.out.println();
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
	}

}
