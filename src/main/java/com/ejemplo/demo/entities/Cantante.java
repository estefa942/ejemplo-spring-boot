package com.ejemplo.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cantante")
public class Cantante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cantante")
    private Integer idCantante;
    private String nombre;
    @Column(name = "genero_musical")
    private String generoMusical;
    @OneToMany(mappedBy = "cantante")
    private List<Album> albums;

    public Cantante(String nombre, String generoMusical, List<Album> albums) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.albums = albums;
    }

    public Cantante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public Integer getIdCantante() {
        return idCantante;
    }

    public void setIdCantante(Integer idCantante) {
        this.idCantante = idCantante;
    }
}
