package com.ejemplo.demo.services;

import com.ejemplo.demo.entities.Album;
import com.ejemplo.demo.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPrueba {
    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getAllAlbums(){
        return (List<Album>) this.albumRepository.findAll();
    }


}
