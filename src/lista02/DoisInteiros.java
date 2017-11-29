package lista02;

import java.util.Scanner;

public class DoisInteiros {
	public static void main(String[] args) {
		Double a;
		Double b;
		
	
	Scanner scan= new Scanner(System.in);
	//leitura pra o usuario
	System.out.print("Digite o primeiro número: ");
	a = scan.nextDouble();
	System.out.print("Digite o segundo numero: ");
	b = scan.nextDouble();
	
	scan.close();
	if(a>b) {System.out.print("a soma dos valores é " + (a+b));}
	else {System.out.print("a multiplicacao dos valores é: "+ (a*b)) ;}
	
}
}