package br.com.generation.atividadelacoderepeticao;

import java.util.Scanner;

public class AtividadeLacoRepeticao02 {
 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, contPar = 0, contImpar = 0;
		
		for(int numero=0; numero< 10; numero++) {
			System.out.println("Digite o número:");
			num = ler.nextInt();
			
			if(num % 2 == 0) {
				contPar++;
				
			}
			else {
				contImpar++;
			}
			System.out.println("Foram digitados " + contPar + " números pares \n");
			System.out.println("E " + contImpar + " números impares");
		}
		
	}
	
}

