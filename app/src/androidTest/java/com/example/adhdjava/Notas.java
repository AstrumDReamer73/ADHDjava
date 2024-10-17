package com.example.adhdjava;

public class Notas {
    public Notas(String descripcion, String titulo,Long fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Long fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    String titulo;
    String descripcion;
    Long fechaCreacion;
}
