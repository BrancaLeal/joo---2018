package main;

public class GameOfPi {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.println("PI");
			} else {
				System.out.println(i);
			}
		}

	}

}
