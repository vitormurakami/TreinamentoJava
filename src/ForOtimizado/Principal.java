package ForOtimizado;

public class Principal {
	public static void main(String[] args) {
		String array[] = {"Jo�o", "Paulo", "Maria", "Ricardo", "Gabriela"};
		
		//o for otimizado ir� percorrer todo o array, e o valor de cada posi��o ser� atribuida a vari�vel declarada
		for (String variavel: array) {
			System.out.println(variavel);
		}
	}
}
