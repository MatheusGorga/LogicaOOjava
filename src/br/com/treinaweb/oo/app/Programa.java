package br.com.treinaweb.oo.app;


import br.com.treinaweb.oo.classes.Cachorro;
import br.com.treinaweb.oo.classes.Gato;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro("toto", 5 , "Cachorro");
		
		System.out.println("ola seu animal e um " + cachorro.getEspecie() + " nome e "  + cachorro.getNome()
				+ " a idade e " + cachorro.getIdade() + " anos");
		if(cachorro.ehAdulto()){
			System.out.println("Animal adulto");
		}else {
			System.out.println("Animal jovem");
		}
		cachorro.emitirBarulho();
		
		System.out.println("--------------------------------------------------");
		
		Gato gato = new Gato("Frajola", 2, "Gato");
		
		System.out.println("ola seu animal e um " + gato.getEspecie() + " nome e "  + gato.getNome()
		+ " a idade e " + gato.getIdade() + " anos");
		
		gato.morrer();
		
		if(gato.ehAdulto() || gato.estaVivo() ){
			System.out.println("Animal adulto");
		}else {
			System.out.println("Animal jovem");
		}
		
		gato.emitirBarulho();
		
		
	}

}
