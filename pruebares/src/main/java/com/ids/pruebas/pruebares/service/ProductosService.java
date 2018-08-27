package com.ids.pruebas.pruebares.service;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ids.pruebas.pruebares.model.Productos;
import com.ids.pruebas.pruebares.repository.ProdRepository;



@Service
public class ProductosService {
	
	@Autowired
	private ProdRepository prodrepository;

	// Recuperar todas las filas de la tabla y completar la lista con objetos
	public List getAllProductos(){
		
		List productos = new ArrayList<>();
		prodrepository.findAll().forEach(productos::add);
		return productos;
				
	}
	//Recupera una fila de la tabla basada en la identificación id
	public Productos getProducto(int id_producto){
		return prodrepository.findById(id_producto).orElse(null);
	}
	
	// Inserta fila en la tabla
	
	public void addProdcutos(Productos productos){
		prodrepository.save(productos);
	}
	
	//actualiza una fila en la tabla
	public void updateProdcutos(int id_productos,Productos productos){
		prodrepository.save(productos);
	}
	//elimiar una fila en la tabla
	public void deleteProducto(int id_producto){
		prodrepository.deleteById(id_producto);
	}
	
	
}
