package br.com.treinaweb.oo.classes;

public class Gato extends Animal {

	public Gato(String nome, int idade, String especie) {
		super(nome, idade, especie);
		// TODO Auto-generated constructor stub
	}

	public Gato(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	// utilização da classe abstrata para emissão do barulho
	@Override
	public void emitirBarulho() {
		// TODO Auto-generated method stub
		if( estaVivo) {
			System.out.println("Miado");
		}else {
			System.out.println("O animal faleceu");
		}
		
	}
	
	
}
