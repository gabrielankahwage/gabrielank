package lista02;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args ) {
		
	
		// Declaro as variaveis
		Double x;
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.print("Digite o n�mero: ");
		x = scan.nextDouble();
		scan.close();
		if(x<0) {System.out.println(x+ " o numero � negativo");}
			if(x==0){System.out.println(x + "o numero � zero");}
			
			if(x>0){System.out.println(x + " O numero � positivo");}
}			
}	
		
	

