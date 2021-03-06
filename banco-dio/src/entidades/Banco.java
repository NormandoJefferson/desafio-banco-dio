package entidades;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
	
	private String nome;
	private List<Conta> contas = new ArrayList<>();
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	public void addContas(Conta c) {
		contas.add(c);
	}
	
	public void buscaClientes() {
		for (Conta c : this.contas) {
			System.out.println(c.getCliente().getNome());
		}
	}

}
