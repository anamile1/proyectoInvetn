package com.Invent.demo.models;

public class DetallesFac {

	private int factura;
	private int producto;
	private double precio_Uni;
	private double iva;
	private int cantidad;
	
	public int getFactura() {
		return factura;
	}
	public void setFactura(int factura) {
		this.factura = factura;
	}
	public int getProducto() {
		return producto;
	}
	public void setProducto(int producto) {
		this.producto = producto;
	}
	public double getPrecio_Uni() {
		return precio_Uni;
	}
	public void setPrecio_Uni(double precio_Uni) {
		this.precio_Uni = precio_Uni;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	} 
	
	public DetallesFac(int factura, int producto, double precio_Uni, double iva, int cantidad) {
		super();
		this.factura = factura;
		this.producto = producto;
		this.precio_Uni = precio_Uni;
		this.iva = iva;
		this.cantidad = cantidad;
		
	}
	
}
