package com.everis;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String apelido;
	private Integer idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pessoa() {

	}

	public Pessoa(String nome, String apelido, Integer idade) {
		super();
		this.nome = nome;
		this.apelido = apelido;
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apelido == null) ? 0 : apelido.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (apelido == null) {
			if (other.apelido != null)
				return false;
		} else if (!apelido.equals(other.apelido))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public int compareTo(Pessoa otherPessoa) {
		return this.getIdade().compareTo(otherPessoa.getIdade());
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", apelido=" + apelido + ", idade=" + idade + "]";
	}
	
	
	
	

}
