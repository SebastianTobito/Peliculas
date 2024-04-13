public class Principal {
    public static void main(String[] args) {

    Pelicula miPelicula = new Pelicula();
    miPelicula.nombre = "Encanto";
    miPelicula.fechaDeLanzamiento = 2021;
    miPelicula.duracionEnMinutos = 120;

    miPelicula.muestraFichaTecnica();
    miPelicula.evalua(8.1);
    miPelicula.evalua(7.9);
        System.out.println(miPelicula.sumaDePuntajes);
        System.out.println(miPelicula.totalDeEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

    Pelicula otraPelicula = new Pelicula();
    otraPelicula.nombre = "Soy leyenda";
    otraPelicula.fechaDeLanzamiento = 2006;
    otraPelicula.duracionEnMinutos = 110;

//        otraPelicula.muestraFichaTecnica();
    }

}