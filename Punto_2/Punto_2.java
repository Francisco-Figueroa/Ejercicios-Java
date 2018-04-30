package Punto_2;
import java.util.Scanner;

public class Punto_2 {

	public static void main(String[] args) {
		int num;
		System.out.print("Ingrese un numero positivo : ");
		Scanner teclado = new Scanner (System.in);
		num = teclado.nextInt();
		if (num <= 0) {
			System.out.print("Por favor ingrese un numero positivo");
		}else if (num > 0 && num <10) {
			System.out.print("Este numero tiene un digitos");
		}else if (num > 10 && num <100) {
			System.out.print("Este numero tiene dos digito");
		} else if (num > 100) {
			System.out.print("Este numero tiene mas de dos digitos");
		}
		
		

	}

}
