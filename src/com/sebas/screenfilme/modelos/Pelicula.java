package com.sebas.screenfilme.modelos;
import com.sebas.screenfilme.calculos.Clasificacion;

public class Pelicula extends Titulo, Clasificacion {

 private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}