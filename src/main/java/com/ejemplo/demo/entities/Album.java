package com.ejemplo.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_album")
    private Integer idAlbum;
    @Column(name = "id_cantante")
    private Integer idCantante;
    private String nombre;
    private String anio;

    @ManyToOne
    @JoinColumn(name="id_cantante", insertable = false, updatable = false)
    private Cantante cantante;

    public Album(String nombre, String anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
}
