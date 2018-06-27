package main;

import molelo.Animal;
import molelo.Animal.Coracao;
import molelo.CorpoHumano;

public class TesteIn {
	public static void main (String[] args) {
		Animal animal = new Animal ();
		Coracao coracao = animal.new Coracao ();//importei a classe com control shift O
	//outra forma é Animal.Coracao coracao = animal.new Coracao (); assim não precisa importar
		coracao.bater ();
		
		Animal.Cerebro cerebro = animal.new Cerebro ();
		cerebro.pensarEm("viajar");
		
		CorpoHumano corpoHumano = new CorpoHumano ();
		corpoHumano.existir();
	}

}
