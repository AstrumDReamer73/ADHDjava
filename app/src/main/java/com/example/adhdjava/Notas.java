package com.example.adhdjava;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Notas")
public class Notas {
    private String titulo;
    private String descripcion;
    @PrimaryKey(autoGenerate = true) private int id;

    public Notas(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
}