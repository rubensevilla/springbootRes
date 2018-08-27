package com.ids.pruebas.pruebares.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="producto")
//@ApiModel(value = "Info entity", description = "Complete data of a entity Info")
public class Productos {

	

    @ApiModelProperty(value = "The id of the info", required = false)
	@Id
	private int id_Producto;
    @ApiModelProperty(value = "The name of the info", required = true)
	@Column(name="nombre_producto")
	private String nomProducto;
	
    @ApiModelProperty(value = "The type of the info", required = true)
	@Column(name="tipo_producto")
	private int tipProducto;


	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Productos(int id_Producto, String nomProducto, int tipProducto) {
		super();
		this.id_Producto = id_Producto;
		this.nomProducto = nomProducto;
		this.tipProducto = tipProducto;
	}


	public int getId_Producto() {
		return id_Producto;
	}


	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}


	public String getNomProducto() {
		return nomProducto;
	}


	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}


	public int getTipProducto() {
		return tipProducto;
	}


	public void setTipProducto(int tipProducto) {
		this.tipProducto = tipProducto;
	}
	
	
	
}
