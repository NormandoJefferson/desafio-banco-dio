package entidades;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;	
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void transferir(double valor ,Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);	
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Titular: " + cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.printf("Saldo: %.2f%n" , this.saldo);
		System.out.println();
	}

}
