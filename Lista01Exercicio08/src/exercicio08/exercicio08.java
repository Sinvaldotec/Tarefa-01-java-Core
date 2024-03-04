package exercicio08;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da base do triângulo");

		int base= sc.nextInt();

		System.out.println("Digite o valor da altura do triângulo");

		int altura= sc.nextInt();

		System.out.println(base*altura/2);
		}}