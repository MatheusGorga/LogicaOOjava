package br.com.treinaweb.oo.classes;

public abstract class Animal {
	private String nome;
	private String especie; 
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	// criação do contrutor para não utilizar o default, com parametros... 
	public Animal (String nome, int idade, String especie) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
	}
	
	// Sobrecarga de classes || assinatura é o tipo dos parametros
	public Animal (String nome) {
		this.nome = nome;
		
	}
	
	
	// abstração da classe para que o animal em questão emita o som devido e não algo fixo
	public abstract void emitirBarulho();
	
	public Boolean ehAdulto() {
		return idade >= 1;
	}
	
	
	
	
}