package br.com.treinaweb.oo.classes;

public class Cachorro  extends Animal {

	public Cachorro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public Cachorro(String nome, int idade, String especie) {
		super(nome, idade, especie);
		// TODO Auto-generated constructor stub
	}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade, "Cachorro");
		// TODO Auto-generated constructor stub
	}

	// utilização da classe abstrata para emissão do barulho
	@Override
	public void emitirBarulho() {
		// TODO Auto-generated method stub
		System.out.println("latido");
		
	}

	
	
}
