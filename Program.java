package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int np = 0;
		int numP[] = new int[np];
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int num[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
			
			if(num[i]%2==0) {
				np++;
			}
			
		}
		System.out.println("NÚMEROS PARES: ");
		for(int i=0; i<n; i++) {
			if(num[i]%2==0) {
				System.out.print(num[i]+"  ");
			}
			
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = "+np);
		
		
	}

}
