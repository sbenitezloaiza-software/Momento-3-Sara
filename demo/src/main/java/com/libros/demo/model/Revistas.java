package com.libros.demo.model;

@Entity
public class Revistas {

    String nombre;
    String autor;
    String categoria;
    String editorial;


    public Revistas(String nombre, String autor, String categoria, String editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.editorial = editorial;
    }

    
    public Revistas() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
 



}
