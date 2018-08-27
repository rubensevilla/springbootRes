package com.ids.pruebas.pruebares.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ids.pruebas.pruebares.model.Tipo;
import com.ids.pruebas.pruebares.repository.TipoRepository;

@Service
public class TipoService {

	@Autowired
	private TipoRepository tiporepository;
	
	
	//reuperar todas las filas y completar la lista con objetos
	public List getAllTipo(){
		List tipo =new ArrayList<>();
		
		tiporepository.findAll().forEach(tipo::add);
		return tipo;
		
	}
	
	//Recupera una fila de la tabla basada en la identificación id
		public Tipo getTipo(int idtipo_producto){
			return tiporepository.findById(idtipo_producto).orElse(null);
		}
		// Inserta fila en la tabla
		
		public void addProdcutos(Tipo tipos){
			tiporepository.save(tipos);
		}
		//actualiza una fila en la tabla
		public void updateProdcutos(int idtipo_productos,Tipo tipo){
			tiporepository.save(tipo);
		}
		//eliminar una fila en la tabla
		public void deleteProducto(int idtipo_producto){
			tiporepository.deleteById(idtipo_producto);
		}
	
	
	
	
	
	
	
}
