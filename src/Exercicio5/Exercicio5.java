package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println(" Digite o Ano");

		int numero = s.nextInt();
		int soma = 0;

		while (numero > 0) {

			soma = soma + numero % 10;
			numero = numero / 10;

		}

		System.out.println("Valor da soma do ano é " + soma);
	}
}