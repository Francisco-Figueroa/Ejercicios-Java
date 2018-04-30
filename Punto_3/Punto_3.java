package Punto_3;
import java.util.Scanner;

public class Punto_3 {

	public static void main(String[] args) {
			int num;
			int x = 0;
			while(x<10) {
				System.out.print("Ingrese un numero positivo : ");
				Scanner teclado = new Scanner (System.in);
				num = teclado.nextInt();
				if(num % 2 == 0) {
					System.out.print("Este numero es par\n");
				}else {
					System.out.print("Este numero es impar\n");
				}
			}

	}

}
