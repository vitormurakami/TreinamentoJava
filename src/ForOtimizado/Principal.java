package ForOtimizado;

public class Principal {
	public static void main(String[] args) {
		String array[] = {"João", "Paulo", "Maria", "Ricardo", "Gabriela"};
		
		//o for otimizado irá percorrer todo o array, e o valor de cada posição será atribuida ao atribudo declarado
		for (String variavel: array) {
			System.out.println(variavel);
		}
	}
}
