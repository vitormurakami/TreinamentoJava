package Threads;

import javax.swing.JOptionPane;

public class AprendendoThread {
	public static void main(String[] args) throws InterruptedException {

		new Thread() {
			public void run() { //Executa o processo
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000); // Da uma pausa (1000 = 1 segundo)
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Enviando relatório!");
				}		
			}
		}.start(); //Liga a thread que fica processando paralelamente
		
		JOptionPane.showMessageDialog(null, "O Sistema continua para o usuário!");

	}
}
