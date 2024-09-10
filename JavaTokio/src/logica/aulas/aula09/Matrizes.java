package logica.aulas.aula09;

public class Matrizes {

	public static void main(String[] args) {
		
		char[][] tabuleiro = new char[3][3];
		
		tabuleiro[0][0] = 'X';
		tabuleiro[1][1] = 'O';
		tabuleiro[2][2] = 'X';
		
		System.out.println();
		
		// 	CRIANDO MAIS ALGUMAS MATRIZES
		
		int[][] matriz = new int[4][5];
		
		int linhas = matriz.length; // quantidade de linhas
		System.out.println(linhas);
		
		int colunas = matriz[0].length; // quantidade de colunas
		System.out.println(colunas);
		
		System.out.println();
		
		int numero = 1;
		
		// FOR PARA INCLUIR VALORES NA MATRIZ
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = numero;
				numero++;
			}
		}
		
		// FOR PARA EXIBIR A MATRIZ
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
