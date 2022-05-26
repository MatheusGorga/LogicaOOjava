package br.com.treinaweb.oo.classes;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
	private String nome;
	private List<Animal> animais;
	private int salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getSalario() {
		return salario;
	}
	
	
	
	public Veterinario() {
		animais = new ArrayList<Animal>();
	}
	
	public void atenderAnimal(Animal animalASerAtendido) {
		animais.add(animalASerAtendido);
		
	}
	
	public void deixarAtenderAnimal(int indiceDoAnimal) {
		animais.remove(indiceDoAnimal);
	}
	
	public void listarAnimais() {
		System.out.println("Animais atendidos ");
		for(int i = 0 ; i < animais.size(); i++) {
			System.out.println("  -" + animais.get(i).getNome() );
		}
	}
	
	
	
}
