package com.sebas.screenfilme.calculos;

import com.sebas.screenfilme.modelos.Pelicula;
import com.sebas.screenfilme.modelos.Serie;
import com.sebas.screenfilme.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
