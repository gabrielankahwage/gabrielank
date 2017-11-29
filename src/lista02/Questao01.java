package lista02;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Double x;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		x = scan.nextDouble();
		scan.close();
		if (x > 0){
		    System.out.println(" o módulo é: " +x);
		}
		if (x < 0){
		    System.out.println("o módulo é : "+ (-1)*x );
		}
		}
}

