package TratamentoDeExcecao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Throws {
	/*
	 	Utilizamos essa palavra chave quando não queremos tratar uma exceção, então, "jogamos" ela para cima, ou seja, passamos a 
	 	responsabilidade para quem chamou o método, quem chamou o método que deve tratar essa exception.    
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Entre com um número Inteiro: ");
		try {
			int num = leNumero();
			System.out.println("Número inserido com sucesso!!!");
		} catch (Exception e) {
			System.out.println("Erro ao inserir número!!!");
			e.printStackTrace();
		}
		
	}
	
	public static int leNumero() throws Exception{
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		return num;
	}
}
