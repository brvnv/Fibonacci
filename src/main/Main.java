package main;

public class Main {
public static void main(String[] args) {
	System.out.println("Sequência de Fibonacci");
	System.out.println("========");
	int f1=0;
	for (int i=0; i<600; i++) {
		f1++;
		int f2=f1;
		int fibonaxy=f1+f2;
		System.out.println(fibonaxy + ";");
	}
	System.out.println("Cansei.");
	}
}