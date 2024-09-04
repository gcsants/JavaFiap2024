package logica.exercicios.aula06;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int a = 5, b = 7, c = 4, d = 8;
		
		boolean A = (a <= b) && (b < d);
		System.out.println(A);
		
		boolean B = (a == b) || (c != b	);
		System.out.println(B);
		
		boolean C = (d > a) && (c >= b);
		System.out.println(C);
		
		boolean D = (a <= b) || (c <= d);
		System.out.println(D);
		
		boolean E = ((b > c) || (c < a)) && (d <= b);
		System.out.println(E);
	}

}
