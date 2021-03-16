package empresa;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner teclacdo = new Scanner(System.in);
		System.out.println("digite o seu palpite:");
		
		int palpite = teclacdo.nextInt();
		String msg;	
		while(palpite < 10000){
			msg = palpite <10000? "Um pouco mais...": "Um pouco menos...";
	/*
	if (palpite < 10000) {
		System.out.println("Um pouco mais...");
	}
	else {
		System.out.println(" Um pouco menos..");
	}
	 */
		
	System.out.println("Digite seu próximo palpite:");
	 palpite = teclacdo.nextInt();
}
		System.out.println("Está Correto!");
	}

}
