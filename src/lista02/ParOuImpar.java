package lista02;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		int x;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		x = scan.nextInt();
		scan.close();
				if (x % 2 == 0){
					System.out.print(x + " é par" );
				}
				else{
				    System.out.print(x + " é impar");
				}
	}
}

