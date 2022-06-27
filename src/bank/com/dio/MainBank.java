package bank.com.dio;

public class MainBank {

	public static void main(String[] args) {
		
		Conta corrente = new ContaCorrente();
		Conta poupança = new ContaPoupança();
		Conta universidade = new ContaUniversitária();
		ContaSalário salario = new ContaSalário();
		
		
		corrente.depositar(756);
		corrente.transferir(210, universidade);
		universidade.transferir(10, poupança);
		poupança.depositar(1347);
		corrente.transferir(100, universidade);
		universidade.sacar(143);
		poupança.sacar(32);
		poupança.transferir(210, universidade);
		universidade.transferir(40, corrente);
		corrente.sacar(52);
		corrente.depositar(342);
		universidade.depositar(150);
		universidade.transferir(32, poupança);
		poupança.transferir(28, universidade);
		
		
		corrente.imprimirExtrato();
		poupança.imprimirExtrato();
		universidade.imprimirExtrato();
		salario.imprimirExtrato();
		

	}
}
