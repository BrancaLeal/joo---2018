package examples;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> nomes = new TreeSet<>();
		System.out.println(nomes.add("Cesar"));
		System.out.println(nomes.add("Fulano"));
		System.out.println(nomes.add("Ciclano"));
		System.out.println(nomes.add("Beltrano"));
		
		System.out.println(nomes.add("nomes"));
		
		nomes.add("João");
		nomes.add("Maria");		
		
		System.out.println(nomes);
		
	}

}
