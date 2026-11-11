package com.libros.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "nombre", length = 50, nullable = false)
    String nombre;

    @Column(name = "autor", length = 50, nullable = false)
    String autor;

    @Column(name = "generoliterario", length = 50, nullable = false)
    String generoliterario;

    @Column(name = "editorial", length = 50, nullable = false)
    String editorial;

    public Libros() {
    }

    public Libros(String nombre, String autor, String generoliterario, String editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.generoliterario = generoliterario;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGeneroliterario() {
        return generoliterario;
    }

    public void setGeneroliterario(String generoliterario) {
        this.generoliterario = generoliterario;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void leer() {
        System.out.println("El libro esta siendo leido");
    }

}
