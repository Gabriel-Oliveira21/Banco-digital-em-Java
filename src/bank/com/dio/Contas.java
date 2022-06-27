package bank.com.dio;

public interface Contas {

	 void sacar(double valor);
		
	
	 void depositar(double valor);
		
	
	 void transferir(double valor, Conta contaDestino); 
	 
	 
	 void imprimirExtrato();
}
