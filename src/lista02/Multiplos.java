package lista02;

import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		Double a;
		Double b;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		a = scan.nextDouble();
		System.out.println("Digite o segundo numero");
		b = scan.nextDouble();
		scan.close();
		if(a%b==0) { System.out.println("os numero sao multiplos");}
		else {System.out.print("os numeros nao sao multiplos");
		}
	}
}
