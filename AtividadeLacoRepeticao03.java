package br.com.generation.atividadelacoderepeticao;

import java.util.Scanner;

public class AtividadeLacoRepeticao03{
	
	public static void main(String[] args) {
          
        Scanner ler = new Scanner(System.in);
        
        int idade = 0;
        int cont21 = 0; 
        int cont50 = 0;
        
        while(idade != -99) {
        System.out.println("Digite sua idade: \n");
        idade = ler.nextInt();
        
        if (idade > 0 && idade < 21) 
        	cont21++;
        
        if(idade > 21 && idade > 50) 
        	cont50++;
        }
     
        
        	System.out.println("Total de menores de 21 anos\n" + cont21);
            System.out.println("Total de maiores de 50 anos\n" + cont50);

  }
  }
