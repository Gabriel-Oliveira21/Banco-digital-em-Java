package bank.com.dio;

public class ContaUniversit├íria extends Conta {
	private static int SEQUENCIAL = 1;

	public ContaUniversit├íria() {
		super.agencia = 3;
		super.numeroConta = SEQUENCIAL++;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Universitaria ---");
		System.out.println(String.format("Agencia : %d", super.agencia));
		System.out.println(String.format("Conta numero : %d", super.numeroConta));
		System.out.println(String.format("Saldo : %.2f", super.saldo));
	}
}
	

