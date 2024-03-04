package exercicio11;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da base maior");

		int B= sc.nextInt();

		System.out.println("Digite o valor da base menor");

		int b= sc.nextInt();

		System.out.println("Digite o valor da altura");

		int h = sc.nextInt();

		System.out.println ("A área do trapézio é de : " + B+b * h/2) ;

		}}
