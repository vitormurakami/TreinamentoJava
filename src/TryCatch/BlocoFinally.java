package TryCatch;

import javax.swing.JOptionPane;

public class BlocoFinally {
	public static void main(String[] args) {
		int i = 0;
		Pessoa p1 = null;
		
		try {
			i = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero")); //No lugar do n�mero informe uma String para exemplificar o erro
			System.out.println(p1.nome);
		}catch (NumberFormatException e) {
			StringBuilder saida = new StringBuilder();
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro de convers�o de n�mero");
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro NullPointerException");
		}catch (Exception e) {
			e.printStackTrace();
		}finally { 
			//Esse bloco sempre ir� ser executado, independentemente se ocorrer um erro ou n�o. 
			JOptionPane.showMessageDialog(null, "O Processo foi finalizado!");
		}
	}
}
