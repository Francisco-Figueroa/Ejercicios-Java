package Punto_8;
import java.util.Scanner;
import Punto_8.Persona;

public class Empleado extends Persona{
	private Scanner teclado;
	private int sueldo;
	
	public void cargar() { 
		  teclado= new Scanner(System.in);
		  System.out.print("Ingrese sueldo:");
		  sueldo=teclado.nextInt();
		}

	public void imprimir2() {
		System.out.println("sueldo:"+sueldo);
	}
	public static void main (String[] ar) {
			   Empleado Empleado;
			   Empleado = new Empleado();
			   Empleado.inicializar();
			   Empleado.cargar();
			   Empleado.imprimir();
			   Empleado.imprimir2();
		}
	
}