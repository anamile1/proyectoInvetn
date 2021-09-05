package com.Invent.demo.models;

public class Producto {

	private int categoria;
	private String nombre;
	private double precio;
	private int cantidad;
	
	
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Producto(int categoria, String nombre, double precio, int cantidad) {
		super();
		this.categoria = categoria;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		
	}
	
	
}
