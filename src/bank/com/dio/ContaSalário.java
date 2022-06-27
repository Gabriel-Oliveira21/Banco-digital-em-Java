package bank.com.dio;

public class ContaSalário {
	private static int SEQUENCIAL = 1;

	public int agencia = 4 ;
	public int numeroConta = SEQUENCIAL++;;
	public double saldo = 1200;
	
	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		saldo -= valor;		
	}
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Salario ---");
		System.out.println(String.format("Agencia : %d", agencia));
		System.out.println(String.format("Conta numero : %d", numeroConta));
		System.out.println(String.format("Saldo : %.2f", saldo));
	}
}
