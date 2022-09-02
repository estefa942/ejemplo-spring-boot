package com.ejemplo.demo.repositories;

import com.ejemplo.demo.entities.Cantante;
import org.springframework.data.repository.CrudRepository;

public interface CantanteRepository extends CrudRepository<Cantante,Integer> {
}
