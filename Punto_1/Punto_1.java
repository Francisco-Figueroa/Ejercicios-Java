package Punto_1;
import java.util.Scanner;
public class Punto_1 {

	public static void main(String[] args) {
		int cantidad;
		float precio;
		float abono = 0;
		int i;
		System.out.print("Ingrese el precio del producto: ");
		Scanner teclado = new Scanner (System.in);
		precio = teclado.nextFloat();
		System.out.print("Ingrese la cantidad de productos que llevara: ");
		Scanner teclado2 = new Scanner (System.in);
		cantidad = teclado2.nextInt();
		for(i=0; i<cantidad; i++){
			abono = abono + precio;
		}
		System.out.print(abono);
	}

}
