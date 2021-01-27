package outrasFuncoes;

public class FuncoesString {

	// OUTRAS FUNCOES DO STRING
	
	public static void main(String[] args) {
		
		String original = "abcde ABC RSTU bcjlmno ";
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();  // tira os espacos em branco
		String s4 = original.substring(2); // gera uma novo String a partir do segundo caractere
		String s5 = original.substring(0,10); // gera uma novo String a partir do caractere 0 ao 10
		String s6 = original.replace("a","x");// troca o A por X
		String s7 = original.replace("ABC","XYZ");
		int i = original.indexOf("bc"); // retorna a posiçao do bc
		int j = original.lastIndexOf("bc"); // retopna a ultima posiçao do bc
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -"+ s1 + "-");
		System.out.println("toUpperCase: -"+ s2 + "-");
		System.out.println("trim: -"+ s3 + "-"); 
		System.out.println("substring: - " + s4 + "-");
		System.out.println("substring 0 ao 10: - " + s5 + "-"); 
		System.out.println("Replace 1: - " + s6 + "-"); 
		System.out.println("Replace 2: - " + s7 + "-");
		System.out.println("indexOf: - " + i + "-");
		System.out.println("lastIndexof: - " + j + "-");

	}

}
