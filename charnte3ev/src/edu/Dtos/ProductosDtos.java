package edu.Dtos;

import java.time.LocalDateTime;
import java.util.Date;

/* Dto del programa, donde tienen distintos campos, getters y setters y contructores*/
public class ProductosDtos {

	long id;
	
	String nombre = "aaaaa";
	
	int cantidad = 99;
	
	double precio = 99.99;
	
	Date fechaDeseadaDeEntrega;
	
	LocalDateTime fechaVenta;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFechaDeseadaDeEntrega() {
		return fechaDeseadaDeEntrega;
	}

	public void setFechaDeseadaDeEntrega(Date fechaDeseadaDeEntrega) {
		this.fechaDeseadaDeEntrega = fechaDeseadaDeEntrega;
	}

	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public ProductosDtos(long id, String nombre, int cantidad, Double precio, Date fechaDeseadaDeEntrega, LocalDateTime fechaVenta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fechaDeseadaDeEntrega = fechaDeseadaDeEntrega;
		this.fechaVenta = fechaVenta;
	}

	public ProductosDtos() {
		// TODO Auto-generated constructor stub
	}
	
	

	
}
