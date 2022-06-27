package bank.com.dio;

public class ContaCorrente extends Conta {
	
	private static int SEQUENCIAL = 1;

	public ContaCorrente() {
		super.agencia = 1;
		super.numeroConta = SEQUENCIAL++;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Corrente ---");
		System.out.println(String.format("Agencia : %d", super.agencia));
		System.out.println(String.format("Conta numero : %d", super.numeroConta));
		System.out.println(String.format("Saldo : %.2f", super.saldo));
	}
}
