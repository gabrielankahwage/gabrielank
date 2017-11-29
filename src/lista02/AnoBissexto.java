package lista02;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		int a;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o ano: ");
		a = scan.nextInt();
		
		scan.close();
		if(a % 4 == 0 && a % 100 == 1|| a % 400 == 0){System.out.print (a +" é bissexto" );}
		else{System.out.println(a+ " O ano não é bissexto");}
		
		
		
	}
	

}
