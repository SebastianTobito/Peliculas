import com.sebas.screenfilme.calculos.CalculadoraDeTiempo;
import com.sebas.screenfilme.calculos.FiltroRecomendaciones;
import com.sebas.screenfilme.modelos.Episodio;
import com.sebas.screenfilme.modelos.Pelicula;
import com.sebas.screenfilme.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

    Pelicula miPelicula = new Pelicula();

    miPelicula.setNombre("Encanto");
    miPelicula.setFechaDeLanzamiento(2021);
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

    Serie houseOfDragon = new Serie();
    houseOfDragon.setNombre("La casa del dragón");
    houseOfDragon.setFechaDeLanzamiento(2022);
    houseOfDragon.setTemporadas(2);
    houseOfDragon.setMinutosPorEpisodio(50);
    houseOfDragon.setEpisodiosPorTemporada(10);

    Pelicula otraPelicula = new Pelicula();
    otraPelicula.setNombre("Soy leyenda") ;
    otraPelicula.setFechaDeLanzamiento(2006) ;
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


    }



}