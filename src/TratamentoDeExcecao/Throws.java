package TratamentoDeExcecao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Throws {
	/*
	 	Utilizamos essa palavra chave quando n�o queremos tratar uma exce��o, ent�o, "jogamos" ela para cima, ou seja, passamos a 
	 	responsabilidade para quem chamou o m�todo, quem chamou o m�todo que deve tratar essa exception.    
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Entre com um n�mero Inteiro: ");
		try {
			int num = leNumero();
			System.out.println("N�mero inserido com sucesso!!!");
		} catch (Exception e) {
			System.out.println("Erro ao inserir n�mero!!!");
			e.printStackTrace();
		}
		
	}
	
	public static int leNumero() throws Exception{
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		return num;
	}
}
