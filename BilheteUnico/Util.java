import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Util {
	
	BilheteUnico[] bd = new BilheteUnico[5];
	
	int index = 0;

	public void menuPrincipal() {
		String aux = "Escolha uma operação:\n1. Administrador\n2. Usuário\n3. Finalizar";
		int opcao;
		
		do {
			opcao = parseInt(showInputDialog(aux));
			if(opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opção inválida");
			} else {
			
			}
		} while(opcao != 3);
	}
	
		
		public void menuAdministrador() {
			String aux = "Escolha uma operação:\n";
			aux += "1. Cadastrar bilhete\n";
			aux += "2. Consultar bilhete\n";
			aux += "3. Sair";
			int opcao;
			
			do {
				opcao = parseInt(showInputDialog(aux));
				if(opcao < 1 || opcao > 3) {
					showMessageDialog(null, "Opcao inválida");
				} else {
					if(opcao == 1) {
						menuAdministrador();
					}
				}
			} while(opcao !=3);
		}
		
		public void menuUsuario() {
			String aux = "Escolha uma operação:\n";
			aux += "1. Consultar saldo\n";
			aux += "2. Carregar bilhete\n";
			aux += "3. Passar na catraca\n";
			aux += "4. Sair";
			int opcao;
			
			do {
				opcao = parseInt(showInputDialog(aux));
				if(opcao < 1 || opcao > 4) {
					showMessageDialog(null, "Opcao inválida");
				} else {
					
				}
			} while(opcao != 4);
		}
		
			public void cadastrarBilhete() {
				if(index < bd.length) {
				String nome = showInputDialog("Nome:");
				String cpf = showInputDialog("CPF:");
				String tipo = showInputDialog("Tipo (estudante / professor / normal):");
				bd[index] = new BilheteUnico(nome, cpf, tipo);
				index++;
			} else {
				showMessageDialog(null, "Procure um posto autorizado");
			}
		
	}
	
}
