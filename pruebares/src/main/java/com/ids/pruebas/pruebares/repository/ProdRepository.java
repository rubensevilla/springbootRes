package com.ids.pruebas.pruebares.repository;

import org.springframework.data.repository.CrudRepository;

import com.ids.pruebas.pruebares.model.Productos;

public interface ProdRepository extends CrudRepository<Productos, Integer> {

}
