package lista02;

import java.util.Scanner;

public class Intervalo05 {
	public static void main(String[] args) {
		
		Double x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o numero: ");
		x = scan.nextDouble();
		scan.close();
		if(x > 4 && x <21) {System.out.println(" o numero esta entre 4 e 20");}
		else {System.out.println("o numero não esta dentro do intervalo");}
	}
}
