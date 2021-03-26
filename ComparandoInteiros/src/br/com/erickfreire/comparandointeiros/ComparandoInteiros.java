package br.com.erickfreire.comparandointeiros;

import java.util.Scanner;

/**
 * Programa em Java que recebe dois valores e compara qual é o maior entre os dois.
 * @author Erick Freire
 * @version 1 - Criado em 25-03-2021 as 23:54
 */

public class ComparandoInteiros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Informe o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		numero2 = entrada.nextInt();
		
		if(numero1 > numero2)
			System.out.printf("O numero1: %d é o maior", numero1);
		
		if(numero1 < numero2)
			System.out.printf("O numero2: %d é o maior", numero2);
		
		if(numero1 == numero2)
			System.out.printf("O numero1: %d e numeor2: %d são iguais", numero1, numero2);

	}

}
