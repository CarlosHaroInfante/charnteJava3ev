package edu.Servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Scanner;

import edu.Dtos.ProductosDtos;
 /* Implementación donde se encuentra la operativa del programa */

public class OperativaImplementacion implements OperativaInterfaz{
	
	Scanner sc = new Scanner(System.in);
	ProductosDtos productos = new ProductosDtos();

	ProductosDtos pedidos = new ProductosDtos();

	
	
	
		private long calcularId(List<ProductosDtos> listaAntigua)
			{
					ProductosDtos productos2 = new ProductosDtos();
					long idCalculado;
					int tamanioLista = ((List<ProductosDtos>) productos2).size();
					if (tamanioLista == 0)
					{
					    idCalculado = 1;
					}
					else
					 {
					    idCalculado = ((TemporalAccessor) productos2).get(tamanioLista-1).getid + 1;
					 }
				 return idCalculado;
			}
		
		public void aniadirVenta(List<ProductosDtos> listaAntigua) {
			
		System.out.println("Datos de la venta del producto");
		
		System.out.println("Nombre del producto");
		productos.setNombre(sc.nextLine());
		
		System.out.println("Cantidad de Productos Vendidos");
		productos.setCantidad(sc.nextInt());
		
		System.out.println("Precion Total por el/los productos vendidos");
		productos.setPrecio(sc.nextDouble());
		
		System.out.println("Fecha cuando se vendió el producto");
		LocalDateTime fechaActual = LocalDateTime.now();
		productos.setFechaVenta(fechaActual);
		System.out.println(fechaActual);
		
		listaAntigua.add(productos);
	
		}
		
		public void calculoVentasDiario(List<ProductosDtos> listaAntigua) {
			
			System.out.println("Dame una fecha en formato dd-MM-yyyy");
			String fecha = sc.next();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDateTime fechaBien = LocalDateTime.parse(fecha, formatter);
			
			for (ProductosDtos producto : listaAntigua) {
				
				if(fechaBien.equals(producto.getFechaVenta())) {
					
					int total = producto.getPrecio();
						
					}
				}
				
			}
			
			
		
		
		public void crearPedido(List<ProductosDtos> listaAntigua) {
			System.out.println("¿Añadir nuevo producto?");
			boolean quieresSeguir = true;
			
			if (quieresSeguir == true) {
			
			System.out.println("Añadir producto al pedido");
			pedidos.setNombre(sc.nextLine());
			
			System.out.println("Nombre del producto");
			pedidos.setNombre(sc.nextLine());
			
			System.out.println("Cantidad de Productos Vendidos");
			pedidos.setCantidad(sc.nextInt());
			
			System.out.println("Dame una fecha en formato dd-MM-yyyy");
			String fecha = sc.next();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDateTime fechaBien = LocalDateTime.parse(fecha, formatter);
			
			
			listaAntigua.add(pedidos);
			
			}
			
			else {
				
				System.out.println(pedidos);
				
			}
			
			
				
			
			
			
		}
		
		public void mostrarVentasDiario(List<ProductosDtos> listaAntigua) {
			
			
			System.out.println("Dame una fecha en formato dd-MM-yyyy");
			String fecha = sc.next();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDateTime fechaBien = LocalDateTime.parse(fecha, formatter);
			
			
			if(fechaBien.equals(productos.getFechaVenta())) {
				
				System.out.println(productos);
				
			}
		}
		
		

		

}