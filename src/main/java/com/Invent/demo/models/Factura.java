package com.Invent.demo.models;

import java.util.Date;

public class Factura {
	
	private int usuario;
	private int cliente;
	private Date fecha;
	private double precio;
	
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Factura(int usuario, int cliente, Date fecha, double precio) {
		super();
		this.usuario = usuario;
		this.cliente = cliente;
		this.fecha = fecha;
		this.precio = precio;
		
	}

}

