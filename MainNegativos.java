package exercicios;

import java.util.Scanner;

public class MainNegativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS");
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);	
			}			
		}				
		sc.close();
	}

}