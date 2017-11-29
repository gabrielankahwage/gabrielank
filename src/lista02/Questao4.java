package lista02;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args ) {
		
	
		// Declaro as variaveis
		Double x;
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.print("Digite o número: ");
		x = scan.nextDouble();
		scan.close();
		if(x<0) {System.out.println(x+ " o numero é negativo");}
			if(x==0){System.out.println(x + "o numero é zero");}
			
			if(x>0){System.out.println(x + " O numero é positivo");}
}			
}	
		
	

