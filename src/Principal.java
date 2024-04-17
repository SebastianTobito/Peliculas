import com.sebas.screenfilme.modelos.Pelicula;

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




//    com.sebas.screenfilme.modelos.Pelicula otraPelicula = new com.sebas.screenfilme.modelos.Pelicula();
//    otraPelicula.nombre = "Soy leyenda";
//    otraPelicula.fechaDeLanzamiento = 2006;
//    otraPelicula.duracionEnMinutos = 110;

//        otraPelicula.muestraFichaTecnica();
    }


}