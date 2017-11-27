package casa02;

import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {
		Float consumo;
		Float s;
		Float litros;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Distancia em km: ");
		s = scan.nextFloat();
		System.out.print("Litros de combustivel consumido por hora: " );
		litros = scan.nextFloat();
		consumo = (s/litros); 
		
		scan.close();
		System.out.print("Consumo: " + consumo );
		
		
	}
}

