package paquete;

import java.util.Scanner;
//import java.util.Calendar;
import java.util.InputMismatchException;

public class Examen2 {
	static Scanner lector = new Scanner(System.in);
	static Scanner lector2 = new Scanner(System.in);
	static boolean condicional = true;
	
	public void pedirDatos(String nombre[], double precio[], double costo[], int num1[], int num2[]) {
		System.out.println();
		System.out.println("Para ejecutar los resultados ingrese los siguientes datos");
		for(int i = 0; i < nombre.length; i++) {
			condicional = true;
			System.out.print("Nombre del producto #" + (i + 1) + ": ");
			nombre[i] = lector2.nextLine();
			do {
				try {
					System.out.println("¿Cuantas unidades de este producto adquirio?");
					System.out.print("Respuesta: ");
					num1[i] = lector.nextInt();
					if (num1[i] < 0) {
						System.out.println("Debe de ingresar un número mayor a 0");
						System.out.println();
					} else {
						condicional = false;
					}
				} catch (InputMismatchException ex) {
					System.out.println("Ingreso un dato erroneo, por favor ingrese un dato válido");
					System.out.println();
					lector.next();
				}
			} while (condicional);
			condicional = true;
			do {
				try {
					System.out.println("¿A cuanto adquirio este producto por unidad?");
					System.out.print("Respuesta: C$");
					costo[i] = lector.nextDouble();
					if (costo[i] < 0) {
						System.out.println("Debe de ingresar un número mayor a 0");
						System.out.println();
					} else {
						condicional = false;
					}
				} catch (InputMismatchException ex) {
					System.out.println("Ingreso un dato erroneo, por favor ingrese un dato válido");
					System.out.println();
					lector.next();
				}
			} while (condicional);
			condicional = true;
			do {
				try {
					System.out.println("¿Cual es el precio de venta por unidad?");
					System.out.print("Respuesta: C$");
					precio[i] = lector.nextDouble();
					if (precio[i] < 0) {
						System.out.println("Debe de ingresar un número mayor a 0");
						System.out.println();
					} else {
						condicional = false;
					}
				} catch (InputMismatchException ex) {
					System.out.println("Ingreso un dato erroneo, por favor ingrese un dato válido");
					System.out.println();
					lector.next();
				}
			} while (condicional);
			condicional = true;
			do {
				try {
					System.out.println("¿Cuantas unidades ha vendido?");
					System.out.print("Respuesta: ");
					num2[i] = lector.nextInt();
					if (num2[i] < 0) {
						System.out.println("Debe de ingresar un número mayor a 0");
						System.out.println();
					} else {
						condicional = false;
					}
				} catch (InputMismatchException ex) {
					System.out.println("Ingreso un dato erroneo, por favor ingrese un dato válido");
					System.out.println();
					lector.next();
				}
			} while (condicional);
			System.out.println(" ");
		}
	}
	public void calcularCantidad(int num1[], int num2[], int num3[]) {
		for (int i = 0; i < num1.length; i++) {
			num3[i] = num1[i] - num2[i];
		}
	}
	public void ordenar(double[] ganancia) {
		for(int i = 1; i < ganancia.length; i++) {
			double valorC = ganancia[i];
			int posicion = i;
			while ((posicion > 0) && (ganancia[posicion -1] > valorC)) {
				ganancia[posicion] = ganancia[posicion - 1];
				posicion -= 1;
			}
			ganancia[posicion] = valorC;
		}
	}
		
}
