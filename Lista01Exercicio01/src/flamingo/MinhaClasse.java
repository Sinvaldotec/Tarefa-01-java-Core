package flamingo;

import java.util.Scanner;

public class MinhaClasse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero para saber o seu sucessor");
		Scanner sc = new Scanner(System.in);
		int  numero = sc .nextInt();
		int resultado = numero + 1;
		
		System.out.println("O nùmero sucessor do" + numero + "é" + resultado);
		
		sc.close();
	
		
	}

}
