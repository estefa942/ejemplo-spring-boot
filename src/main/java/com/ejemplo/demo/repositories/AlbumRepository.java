package com.ejemplo.demo.repositories;

import com.ejemplo.demo.entities.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album,Integer> {
}
