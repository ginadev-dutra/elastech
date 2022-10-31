package streams;

import java.util.Objects;

public class Pessoa {

	private String cpf;
	private String nome;


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass())
			return false;

		Pessoa pessoa = (Pessoa) o;
		return cpf.equals(pessoa.cpf);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	private String cidade;
	private Integer idade;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String cidade, Integer idade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	

}
