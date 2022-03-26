package aplicacao;

import entidades.Banco;
import entidades.Cliente;
import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class App {

	public static void main(String[] args) {
		
		System.out.println("==== Sistema do banco DIO ====");
		
		Cliente c1 = new Cliente("José Mateus", "123.424.523-89");
		Cliente c2 = new Cliente("André da Silva", "123.452.563-15");
		Cliente c3 = new Cliente("Arthur Gepeto", "123.520.533-95");
		
		Conta cc1 = new ContaCorrente(c1);
		Conta cc2 = new ContaCorrente(c2);
		Conta cp1 = new ContaPoupanca(c3);
		
		Banco dio = new Banco("DIO");
		
		dio.addContas(cc1);
		dio.addContas(cc2);
		dio.addContas(cp1);
		
		System.out.println();
		System.out.println("Clientes:");
		
		dio.buscaClientes();
		
		System.out.println();
		System.out.println("Dados dos clientes:");
		cc1.imprimirExtrato();
		cc2.imprimirExtrato();
		cp1.imprimirExtrato();
		
		System.out.println();
		System.out.println("Dados atualizados após movimentações:");
		
		cc1.depositar(1000);
		cc2.depositar(500);
		cc1.transferir(300, cp1);
		cc1.imprimirExtrato();
		cc2.imprimirExtrato();
		cp1.imprimirExtrato();
		
	}
	
}
