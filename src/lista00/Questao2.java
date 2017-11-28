package lista00;

import java.util.Scanner;
public class Questao2 {
	public static void main(String[] args){
		//Declara as variaveis
		Double lit;
		Double dist;
		Double valor;
		Double preco;
		
		
		
		//Leitura do programa
		Scanner scan= new Scanner(System.in);

		//leitura para o usuario
		System.out.print("Litros de Combustível: ");
		lit = scan.nextDouble();
		System.out.print("Distancia percorrida em km: ");
		dist = scan.nextDouble();
		System.out.print("Valor do litro de Combustivel: ");
		preco = scan.nextDouble();
		valor = scan.nextDouble();
		
		valor = preco*dist*lit;
		
		System.out.print("O gasto é : R$" +(valor) );
		
		scan.close();
		
			
	}
}
