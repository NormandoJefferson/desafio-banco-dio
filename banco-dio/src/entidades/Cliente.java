package entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
	
	protected String nome;
	protected String cpf;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
}
