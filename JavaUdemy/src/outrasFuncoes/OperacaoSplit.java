package outrasFuncoes;

public class OperacaoSplit {

	public static void main(String[] args) {
		
		// Retorna um vetor com as palavras
		
		String nome = "Republica Federativa do Brasil";
		
		String[] vect = nome.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);

	}

}
