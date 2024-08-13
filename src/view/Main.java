package view;

import java.util.Scanner;

import controller.FatorialController;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FatorialController fatController = new FatorialController();
		
		int n;
		do {
			System.out.println("Digite um número inteiro positivo ímpar menor que 20:");
			n = sc.nextInt();
		}
		while (n < 1 || n % 2 == 0 || n > 20);
		
		int resultado = fatController.fatorialDuplo(n);
		System.out.println(n + "!! = " + resultado);
	}
}
