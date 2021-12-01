package TryCatch;
import javax.swing.JOptionPane;
public class TryCatchSimples {
	public static void main (String[] args) {
		try {
			Pessoa p1 = null;
			System.out.println(p1.nome);
			System.out.println(p1.idade);
		}catch(Exception e) {
			//imprime o erro no console com todos os detalhes (linha, m�todo...)
			e.printStackTrace(); 
			JOptionPane.showMessageDialog(null, "Erro ao tentar exibir o nome!"); //exibe uma mensagem ao usu�rio sobre o erro
		}
	}
}

