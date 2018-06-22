package main;

public class Fibonacci2 {

	public static void main(String[] args) {
		
		int qntdseg = 10;
		for (int i = 1; i <= qntdseg; i++)
		{
			System.out.println(fibonacci (i));
		}
	}
	
	public static int fibonacci (int qntdseg) {
		if (qntdseg <= 1) {
			return qntdseg;
			} else {
				return fibonacci (qntdseg - 1) + fibonacci (qntdseg-2);
			}
	}

}
