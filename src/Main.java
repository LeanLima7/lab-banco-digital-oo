
public class Main {

	public static void main(String[] args) {
		Cliente leanderson = new Cliente("Leanderson", "leanderson.lima@gft.com", "Al. Rio Negro, 585 - Alphaville Industrial, Barueri - SP");
		Cliente cris = new Cliente("Cris", "cris.lima@gft.com", "Al. Rio Negro, 585 - Alphaville Industrial, Barueri - SP");
		Cliente raoni = new Cliente("Raoni", "raoni.rod@gft.com", "Al. Rio Negro, 585 - Alphaville Industrial, Barueri - SP");
		Cliente karina = new Cliente("Karina", "karina.oka@gft.com", "Al. Rio Negro, 585 - Alphaville Industrial, Barueri - SP");

		Conta contaCorrente = new ContaCorrente(leanderson);
		Conta poupanca = new ContaPoupanca(leanderson);
		Conta poupanca2 = new ContaPoupanca(cris);
		Conta juridica = new ContaJuridica(raoni);
		Conta universitaria = new ContaUniversitaria(karina);

		contaCorrente.depositar(100);
		contaCorrente.transferir(100, poupanca);

		poupanca.imprimirExtrato();

		contaCorrente.imprimirExtrato();
		poupanca2.imprimirExtrato();

		juridica.depositar(85);
		juridica.imprimirExtrato();

		universitaria.depositar(50);
		universitaria.imprimirExtrato();

	}

}
