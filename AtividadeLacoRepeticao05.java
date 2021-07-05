package br.com.generation.atividadelacoderepeticao;

import java.util.Scanner;

public class AtividadeLacoRepeticao05 {

	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
		
		int soma = 0;
		int numero;
		
		do {
			System.out.print("Informe um nº para a soma (quando desejar finalizar a soma digite 0):");
			numero = read.nextInt();
			soma += numero;
		} while(numero != 0);
		
		System.out.println("A soma dos números digitados é:" + soma);
	}

}



