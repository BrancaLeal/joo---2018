package main;

public class Fibonacci {

	public static void main(String[] args) {
		
		int anterior = 0;
		int posterior = 1;
		
		System.out.println (anterior);

        while (posterior < 101) {

        	System.out.println (posterior);

        	posterior = posterior + anterior;
        	anterior = posterior - anterior;

        }

	}
}