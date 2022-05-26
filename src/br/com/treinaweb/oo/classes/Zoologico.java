package br.com.treinaweb.oo.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String nome;
	private List<Animal> animais;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Zoologico() {
		animais = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal animalASerAdicionado) {
		animais.add(animalASerAdicionado);
	}
	
	public void removeAnimal(int indiceDoAnimal) {
		animais.remove(indiceDoAnimal);
	}
	
	public void listarAnimais() {
		System.out.println("Animais do zoolofico");
		for(int i = 0 ; i < animais.size(); i++) {
			System.out.println("  -" + animais.get(i).getNome() );
		}
	}
}
