package com.Invent.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
	
	private Long id_producto;
	private int categoria;
	private String nombre;
	private double precio;
	private int cantidad;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId_producto() {
		return id_producto;
	}
	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}
	
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
	
	public Producto() {
		
	}
	

	public Producto(int categoria, String nombre, double precio, int cantidad) {
		super();
		this.categoria = categoria;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", categoria=" + categoria + ", nombre=" + nombre + ", precio="
				+ precio + ", cantidad=" + cantidad + "]";
	}
	
	
}
