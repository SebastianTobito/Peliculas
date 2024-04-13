public class Pelicula {

        String nombre;
        int fechaDeLanzamiento;
        int duracionEnMinutos;
        boolean incluidaEnElPlan;
        double sumaDePuntajes;
        int totalDeEvaluaciones;

        void muestraFichaTecnica(){
            System.out.println("\nEl nombre de la pelicula es: " + nombre);
            System.out.println("El año del lanzamiento es: " + fechaDeLanzamiento);
            System.out.println("Su duracion es de: " + duracionEnMinutos);
        }

        void evalua(double nota){
            sumaDePuntajes = sumaDePuntajes + nota;
            totalDeEvaluaciones++;
        }

        double calculaMedia(){
            return sumaDePuntajes / totalDeEvaluaciones;

        }


}