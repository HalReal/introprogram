package paquete;

import java.util.Scanner;
import java.util.Calendar;
import java.util.InputMismatchException;

public class Examen {
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
	
	public static void main(String[] args) {
		Examen obj = new Examen();
		Calendar calendario = Calendar.getInstance();
		int mes = calendario.get(Calendar.MONTH);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int agno = calendario.get(Calendar.YEAR);
		int num = 0;
		
		System.out.print("Quién está realizando los registros? (Ingrese su nombre): ");
		 String nombre = lector2.nextLine();
		System.out.println();
		System.out.println("----Bienvenid@ a nuestra app " + nombre + "----");
		System.out.println("Bienvenido a la pulperia Barrilito, el fin de la app es");
		System.out.println("de tener un control de las compras y el inventario de dicha pulperia");
		System.out.println();
		
		System.out.println("Fecha: " + dia + " / " + mes + " / " + agno);
		System.out.println(" ");
		System.out.println("Este programa le ayudara a calcular sus ganancias");
		condicional = true;
		do {
			try {
				System.out.println("¿Cuantos productos desea ingresar?");
				System.out.print("Respuesta: ");
				num = lector.nextInt();
				if (num < 0) {
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
		String nombreproducto[] = new String[num];
		int cantidad1[] = new int[num];
		int cantidad2[] = new int[num];
		int cantidad3[] = new int[num];
		double precioproducto[] = new double[num];
		double costoproducto[] = new double[num];
		double[] ganancia = new double[num]; 
		int productosVendidos = 0;
		double gananciaTotal = 0;
		
		obj.pedirDatos(nombreproducto, precioproducto, costoproducto, cantidad1, cantidad2);
		obj.calcularCantidad(cantidad1, cantidad2, cantidad3);

		System.out.println("------------------");
		System.out.println("    RESULTADOS    ");
		System.out.println("------------------");
		System.out.println();
		for(int i = 0; i < ganancia.length; i++) {
			ganancia[i] = (precioproducto[i] - costoproducto[i]) * cantidad2[i];
			gananciaTotal = gananciaTotal + ganancia[i];
		}
		obj.ordenar(ganancia);
		System.out.println("----Ganancias por cada producto----");
		for (int i = 0; i < ganancia.length; i++) {
				System.out.println("La ganancia del producto " + nombreproducto[i] + " es: C$" + ganancia[i]);
		}
		System.out.println();
		System.out.println("----Ganancias totales----");
		System.out.println("La ganancia por todos los productos vendidos es: C$" + gananciaTotal);
		System.out.println();
		System.out.println("----Productos vendidos por cada producto----");
		for (int i = 0; i < cantidad2.length; i++) {
				System.out.println("Los productos vendidos de " + nombreproducto[i] + " son: " + cantidad2[i]);
				productosVendidos = productosVendidos + cantidad2[i];
		}
		System.out.println();
		System.out.println("----Productos vendidos----");
		System.out.println("La cantidad de productos vendidos es: " + productosVendidos);
	}

}

