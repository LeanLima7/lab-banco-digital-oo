
public class ContaJuridica extends Conta {

	public ContaJuridica(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Juridica ===");
		super.imprimirInfosComuns();
	}
}
