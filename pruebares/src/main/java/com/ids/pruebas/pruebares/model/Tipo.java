package com.ids.pruebas.pruebares.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="tipo_prodcuto")
//@ApiModel(value = "Info entity", description = "Complete data of a entity Info")
public class Tipo {

    @ApiModelProperty(value = "The id of the info", required = false)
	@Id
	private int idtipo_producto;
    @ApiModelProperty(value = "The Description of the info", required = true)
	@Column(name="descripcion")
	private String descripcion;

	public Tipo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo(int idtipo_producto, String descripcion) {
		super();
		this.idtipo_producto = idtipo_producto;
		this.descripcion = descripcion;
	}

	public int getIdtipo_producto() {
		return idtipo_producto;
	}

	public void setIdtipo_producto(int idtipo_producto) {
		this.idtipo_producto = idtipo_producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
	
}
