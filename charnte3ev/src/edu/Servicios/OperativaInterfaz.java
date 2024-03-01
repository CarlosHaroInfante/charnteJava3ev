package edu.Servicios;

import java.util.List;

import edu.Dtos.ProductosDtos;
/* Interfaz donde se encuentran los métodos que contienen la operativa del programa */

public interface OperativaInterfaz {

	public void aniadirVenta(List<ProductosDtos> listaAntigua);
	
	public void calculoVentasDiario(List<ProductosDtos> listaAntigua);
	
	public void crearPedido(List<ProductosDtos> listaAntigua);
	
	public void mostrarVentasDiario(List<ProductosDtos> listaAntigua);
}
