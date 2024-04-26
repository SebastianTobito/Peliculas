package com.sebas.screenfilme.principal;

import com.sebas.screenfilme.modelos.Pelicula;
import com.sebas.screenfilme.modelos.Serie;
import com.sebas.screenfilme.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Soy leyenda", 2006);
        otraPelicula.evalua(7);
        var nuevaPelicula = new Pelicula("Lord of the rings", 2001);
        nuevaPelicula.evalua(8);
        Serie houseOfDragon = new Serie("La casa del dragón", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(nuevaPelicula);
        lista.add(houseOfDragon);


        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>3) {
                System.out.println(pelicula.getClasificacion());
            }
        }
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Leonardo Di Caprio");
        listaDeArtistas.add("Emma Watson");
        listaDeArtistas.add("Tom Hardy");
        System.out.println("Lista de artistas no ordenada" + listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada"+listaDeArtistas);
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada"+ lista);

    }
}