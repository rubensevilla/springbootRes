package com.ids.pruebas.pruebares.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ids.pruebas.pruebares.model.Tipo;
import com.ids.pruebas.pruebares.service.TipoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Tipo")
public class TipoController {

	@Autowired
	private TipoService tiposervice;
	
	//---------------Recupera todos los tipos de  producto-------------------
		@ApiOperation(value = "Recuperar todos los tipos de productos", notes = "Access only for Admin Role")
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List getAllTipo(){
		return tiposervice.getAllTipo();
	}
	//---------------Recupera un tipo  producto-------------------
	@ApiOperation(value = "Recupera un tipo  producto", notes = "Access only for Admin Role")
	@RequestMapping(value = "/{idtipo_producto}", method = RequestMethod.GET)
	public Tipo getProductos(@PathVariable int idtipo_producto){
		return tiposervice.getTipo(idtipo_producto);
	}
	//---------------Crea un  tipo producto-------------------
	@ApiOperation(value = "Crea un  tipo producto", notes = "Access only for Admin Role")
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void addProdcutos(@RequestBody Tipo tipo){
		tiposervice.addProdcutos(tipo);
	}
	//---------------Actualizar un tipo producto-------------------
	@ApiOperation(value = "Actualizar un tipo producto", notes = "Access only for Admin Role")
	@RequestMapping(value = "/{idtipo_producto}", method = RequestMethod.PUT)
	public void updateProducto(@RequestBody Tipo tipo,@PathVariable int idtipo_producto){
		tiposervice.updateProdcutos(idtipo_producto, tipo);
	}
	
	// ------------ Eliminar un tipo producto ------------
	@ApiOperation(value = "Eliminar un tipo producto", notes = "Access only for Admin Role")
		@RequestMapping(value = "/{idpro_producto}", method = RequestMethod.DELETE)
		public void deleteProdcutos(@PathVariable int idtipo_producto) {
			tiposervice.deleteProducto(idtipo_producto);
		}
	

	
}
