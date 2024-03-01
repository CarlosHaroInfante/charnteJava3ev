package edu.Controladores;

import java.util.ArrayList;
import java.util.List;

import edu.Dtos.ProductosDtos;
import edu.Servicios.MenuImplementacion;
import edu.Servicios.MenuInterfaz;
import edu.Servicios.OperativaImplementacion;
import edu.Servicios.OperativaInterfaz;

public class Inicio {
		/*
		CHI 01-03-24
		Clase principal donde se encuentran las llamadas a métodos, cases, etc.
		*/
	public static void main(String[] args) {
		
		
		
		MenuInterfaz menu = new MenuImplementacion();
		OperativaInterfaz op = new OperativaImplementacion();
		List<ProductosDtos> producto = new ArrayList<ProductosDtos>();
		boolean cerrarMenu = false;
		
		while(!cerrarMenu) {
			
			int opcion = menu.menu();
			
			switch(opcion) {
			
			case 0:
				System.out.println("Se cierra el Menú");
				cerrarMenu = true;
				break;
			case 1:
				System.out.println("Opción de Gerente");
				int opcion2 = menu.menuG();
				switch(opcion2) {
				
					case 0:
						System.out.println("Se cierra el Menú");
						cerrarMenu = true;
						break;
					case 1:
						System.out.println("Mostrar todas las ventas del día");
						op.mostrarVentasDiario(producto);
						break;
					case 2:
						System.out.println("Crear un pedido para proveedores");
						op.crearPedido(producto);
						break;
					default:
						System.out.println("Ninguna opción válida");
						break;
					}
				case 2:
					System.out.println("Opción de Empleado");
					int opcion3 = menu.menuE();
					switch(opcion3) {
					
					case 0:
						System.out.println("Se cierra el Menú");
						cerrarMenu = true;
						break;
					case 1:
						System.out.println("Cálculo total de ventas diario");
						op.calculoVentasDiario(producto);
						break;
					case 2:
						System.out.println("Añadir ventas");
						op.aniadirVenta(producto);
						break;
					default:
						System.out.println("Ninguna opción válida");
						break;
					}
				default:
					System.out.println("Ninguna opción válida");
					break;
					
				
				
			
			}
			
		}
		
	}

}
