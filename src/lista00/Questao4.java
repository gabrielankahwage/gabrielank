package lista00;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		//Declaro as variaveis
		int carros;
		int total; 
		
		//leitura 
		Scanner scan= new Scanner(System.in);
		System.out.print("Quantos carros foram vendidos: ");
		carros = scan.nextInt();
		total= 800+300*carros;
		scan.close();
		System.out.print("o Salario total é: " +total);
		
		
	}
}
