package main;

public class Main {
public static void main(String[] args) {
	System.out.println("Sequência de Fibonacci");
	System.out.println("========");
	int f1=0;
	int f2=1;
	for (int i=0; i<600; i++) {
		int fibonacci=f1+f2;
		System.out.println(fibonacci + ";");

	}
	System.out.println("Cansei.");
	}
}