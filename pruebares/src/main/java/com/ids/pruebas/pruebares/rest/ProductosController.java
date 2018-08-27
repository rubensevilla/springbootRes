package com.ids.pruebas.pruebares.rest;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ids.pruebas.pruebares.model.Productos;
import com.ids.pruebas.pruebares.service.ProductosService;

import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/producto")
public class ProductosController {

	
	@Autowired
	private ProductosService productosservice;
	//---------------recupera todos los productos-------------------
	@ApiOperation(value = "recuperar todos los productos", notes = "Access only for Admin Role")
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List getAllProductos(){
		return productosservice.getAllProductos();
	}
	//---------------recupera un producto-------------------
	@ApiOperation(value = "recuperar un producto", notes = "Access only for Admin Role")
	@RequestMapping(value = "/{id_producto}", method = RequestMethod.GET)
	public Productos getProductos(@PathVariable int id_producto){
		return productosservice.getProducto(id_producto);
	}
	//---------------crea un producto-------------------
	@ApiOperation(value = "crear productos", notes = "Access only for Admin Role")
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void addProdcutos(@RequestBody Productos productos){
		productosservice.addProdcutos(productos);
	}
	//---------------actualizar un producto-------------------
	@ApiOperation(value = "actualizar un  producto", notes = "Access only for Admin Role")
	@RequestMapping(value = "/{id_producto}", method = RequestMethod.PUT)
	public void updateProducto(@RequestBody Productos productos,@PathVariable int id_productos){
		productosservice.updateProdcutos(id_productos, productos);
	}
	
	// ------------ Eliminar un producto ------------
	@ApiOperation(value = "Eliminar un producto", notes = "Access only for Admin Role")
		@RequestMapping(value = "/{id_producto}", method = RequestMethod.DELETE)
		public void deleteProdcutos(@PathVariable int id_producto) {
			productosservice.deleteProducto(id_producto);
		}
	
	
	
	
	
}
