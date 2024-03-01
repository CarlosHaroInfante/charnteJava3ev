package edu.Servicios;

import java.util.Scanner;

/*
CHI 01-03-24
Métodos de los menús.
*/
public class MenuImplementacion implements MenuInterfaz{
	Scanner sc = new Scanner(System.in);
	
	public int menu(){
		
		
		
		System.out.println("Tipo de Personal");
		
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Menú Empleado");
		System.out.println("[2] - Menú Gerente");
		
		int op = sc.nextInt();
		
		return op;
	}
	
	public int menuE() {
		
		System.out.println("Elige una opción");
		
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Cálculo total de ventas diario");
		System.out.println("[2] - Añadir venta");
		
		int op2 = sc.nextInt();
		
		return op2;
	}
	
		public int menuG() {
		
		System.out.println("Elige una opción");
		
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Mostrar todas las ventas del día");
		System.out.println("[2] - Crear un pedido para proveedores");
		
		int op3 = sc.nextInt();
		
		return op3;
	}
	
}
