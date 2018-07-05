package examples;

import java.util.ArrayList;
import java.util.HashMap;

public class ListsVSMapExample {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		System.out.println("============= Adicionando à lista ============");
		TimeCounter.iniciarCronometro();
		for (int i=0; i<1000000; i++) {
			lista.add("Item" +i); 
		}
	TimeCounter.encerrarCronometro("Adição à lista"); 
	
	System.out.println("============ Adicionando ao Mapa ============");
	HashMap<String, Integer> mapa = new HashMap<>();
	TimeCounter.iniciarCronometro();
	for (int i=0; i<1000000; i++) {
		mapa.put("Item" +i, i);
	}
	TimeCounter.encerrarCronometro("Adição ao Mapa");
	
	String itemProcurado = "Item999999";
	
	System.out.println("============ Procurando na lista ============");
	TimeCounter.iniciarCronometro();
	for (String item : lista) {
		if (item.equals(itemProcurado)) {
			TimeCounter.encerrarCronometro("Procurar em lista: " + itemProcurado);
			break;
		}
	}
	
	System.out.println("================= Procurando no mapa ====================");
	TimeCounter.iniciarCronometro();
	mapa.get(itemProcurado);
	TimeCounter.encerrarCronometro("Procurar em mapa: " + itemProcurado);
	
	//Capacidade inicial
	System.out.println("============= Adicionando à lista c/ capacidade inicial ============");
	ArrayList<String> listaFixa = new ArrayList<>(12000000);
	TimeCounter.iniciarCronometro();
	for (int i=0; i<1000000; i++) {
		listaFixa.add("Item" +i); 
	}
TimeCounter.encerrarCronometro("Adição à listaFixa"); 

System.out.println("============ Adicionando ao Mapa c/ capacidade inicial ============");
HashMap<String, Integer> mapaFixa = new HashMap<>(12000000);
TimeCounter.iniciarCronometro();
for (int i=0; i<1000000; i++) {
	mapa.put("Item" +i, i);
}
TimeCounter.encerrarCronometro("Adição ao mapaFixa");
	
	}

}
