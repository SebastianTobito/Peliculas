package com.sebas.screenfilme.principal;

import com.sebas.screenfilme.calculos.CalculadoraDeTiempo;
import com.sebas.screenfilme.calculos.FiltroRecomendaciones;
import com.sebas.screenfilme.modelos.Episodio;
import com.sebas.screenfilme.modelos.Pelicula;
import com.sebas.screenfilme.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.setDuracionEnMinutos(120);

        miPelicula.muestraFichaTecnica();

        System.out.println("\n*********************");
        System.out.println(miPelicula.getNombre());
        System.out.println("*********************\n");


        miPelicula.evalua(8.1);
        miPelicula.evalua(7.9);
        miPelicula.evalua(9.2);

        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie houseOfDragon = new Serie("La casa del dragón",2022);
        houseOfDragon.setTemporadas(2);
        houseOfDragon.setMinutosPorEpisodio(50);
        houseOfDragon.setEpisodiosPorTemporada(10);

        Pelicula otraPelicula = new Pelicula("Soy leyenda",2006);
        otraPelicula.setDuracionEnMinutos(110);

        System.out.println("\n***************");
        houseOfDragon.muestraFichaTecnica();
        System.out.println(houseOfDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println("\n***********");
        calculadora.incluye(houseOfDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("El tiempo total para ver todo nuestro catalogo es: " + calculadora.getTiempoTotal());

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa del dragon");
        episodio.setSerie(houseOfDragon);
        episodio.setTotalVisualizaciones(98);
        filtroRecomendaciones.filtra(episodio);

        var nuevaPelicula = new Pelicula("Lord of the rings",2001);
        nuevaPelicula.setDuracionEnMinutos(180);



        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(nuevaPelicula);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("\nArrays");
        System.out.println("El tamaño de la lista de películas es: " + listaDePeliculas.size());
        System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);
        System.out.println("to string de la pelicula " + listaDePeliculas.get(0).toString());



    }



}