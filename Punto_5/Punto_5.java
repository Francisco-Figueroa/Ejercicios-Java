package Punto_5;
import java.util.Scanner;

public class Punto_5 {

	public static void main(String[] args) {
		int num;
		int x = 0;
		int count = 0; 
		while(x<9999) {
			System.out.print("Ingrese un numero: ");
			Scanner teclado = new Scanner (System.in);
			num = teclado.nextInt();
			x = num;
			if(num >= 9999 ) {
				System.out.print("Ha finalizado el proceso\n");
			}else { 
				count = count + num;
			}
		}
		if(count>0) {
			System.out.print("El numero es mayor a cero");
		}else if(count ==0) {
			System.out.print("Es igual a cero");
		}else {
			System.out.print("Es menor");
		}
	}
	

}
