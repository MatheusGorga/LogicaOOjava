package br.com.treinaweb.oo.app;


import br.com.treinaweb.oo.classes.Animal;
import br.com.treinaweb.oo.classes.Cachorro;
import br.com.treinaweb.oo.classes.Gato;
import br.com.treinaweb.oo.classes.Zoologico;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Cachorro("toto", 2 , "Cachorro");
		
		System.out.println("ola seu animal e um " + animal.getEspecie() + " nome e "  + animal.getNome()
				+ " a idade e " + animal.getIdade() + " anos");
		
		if(animal.ehAdulto()){
			System.out.println("Animal adulto");
		}else {
			System.out.println("Animal jovem");
		}
		animal.emitirBarulho();
		
		System.out.println("--------------------------------------------------");
		
		Zoologico zoo = new Zoologico();
		zoo.setNome("zOOlogica");
		zoo.addAnimal(animal);
		Animal animal2 = new Gato("Ze", 3);
		zoo.addAnimal(animal2);
		System.out.println("Animais do Zoologico - " + zoo.getNome());
		zoo.listarAnimais();
		
		zoo.removeAnimal(0);
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Animais do Zoologico - " + zoo.getNome());
		zoo.listarAnimais();
		
		
		
		
	}

}
