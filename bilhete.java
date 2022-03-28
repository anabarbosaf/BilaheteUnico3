import java.util.Random;

public class bilhete {

	// atributos
	int numero;
	double saldo;
	static double valorDaPassagem = 4.40; // static para que os objetos nao recebam uma
	Usuario usuario;

	// construtor
	public bilhete(String nome, String cpf, String tipo) {
		Random gerador = new Random();
		this.numero = gerador.nextInt(10000); // gera um numero abaixo de 10000
		this.saldo = 0;
		this.usuario = new Usuario(nome, cpf, tipo);

	}

	// método para retornar o valor do saldo
	public double consultarSaldo() {
		return this.saldo; // ou return saldo1
	}

	public void carregar(double valor) {
		this.saldo += valor;
	}

	public void passarNaCatraca() {
		if (saldo >= valorDaPassagem) {
			if (usuario.tipo.equalsIgnoreCase("estudante") || usuario.tipo.equalsIgnoreCase("professor")) {
				saldo -= valorDaPassagem / 2;
			}else {
				saldo-= valorDaPassagem;
			}
		}
	}

}
