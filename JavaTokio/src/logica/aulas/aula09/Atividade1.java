package logica.aulas.aula09;

public class Atividade1 {

	public static void main(String[] args) {
		 
		String nomes[] = {"Ana", "Bia", "Rodrigo", "Bruno"};
		
	for (int j = 0; j < nomes.length; j++) {
		String str = nomes[j];
		
		for (int i = j + 1; i < nomes.length; i++) {
			System.out.println(str + ", " + nomes[i]);
		}
	}

	}

}
