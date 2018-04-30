package Punto_7;
import java.util.Scanner;

public class Operaciones {
	private Scanner teclado;
	private int num1;
	private int num2;
	private int resul1;
	private int resul2;
	private int resul3;
	private int resul4;
	
	public void carga() {
		teclado= new Scanner(System.in);
		System.out.print("Ingrese el primer número");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo número");
		num2 = teclado.nextInt();
	}
	
	public void suma() {
		resul1 = num1 + num2;
	}
	
	public void resta() {
		resul2 = num1 - num2;
	}
	
	public void multi() {
		resul3 = num1 * num2;
	}
	
	public void divi() {
		resul4 = num1 / num2;
	}
	
	public void imprimir() {
		System.out.println(num1+" + "+num2+" = "+resul1);
		System.out.println(num1+" - "+num2+" = "+resul2);
		System.out.println(num1+" * "+num2+" = "+resul3);
		System.out.println(num1+" / "+num2+" = "+resul4);
	}
	public static void main(String[] args) {
		Operaciones calculadora;
		calculadora = new Operaciones();
		calculadora.carga();
		calculadora.suma();
		calculadora.resta();
		calculadora.multi();
		calculadora.divi();
		calculadora.imprimir();

	}

}
