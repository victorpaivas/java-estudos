package bytebankcomposto;

public class Conta {

	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {

		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Novo saldo R$" + saldo);
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}

	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
