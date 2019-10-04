package application;

import model.entities.Fibonacci;

public class Program {

	public static void main(String[] args) {

		for (int i = 0; i < 30; i++) {
			System.out.println("(" + i + ")  " + Fibonacci.fibo(i) + "\t");
		}

	}

}
