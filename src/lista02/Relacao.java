package lista02;

import java.util.Scanner;

public class Relacao {
	public static void main(String[] args) {
		Double a;
		Double b;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		a = scan.nextDouble();
		System.out.println("Digite o segundo numero");
		b= scan.nextDouble();
		scan.close();
		if(a<b) {System.out.print("o primeiro numero é menor que o segundo");}
		if(a==0) {System.out.print(" Os numeros sao iguais");}
		if(a>b){System.out.print(a + "é maior que" +b);}
		
	}
}
