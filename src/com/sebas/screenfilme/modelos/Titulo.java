package com.sebas.screenfilme.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidaEnElPlan;
    private double sumaDePuntajes;
    private int totalDeEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidaEnElPlan(boolean incluidaEnElPlan) {
        this.incluidaEnElPlan = incluidaEnElPlan;
    }

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidaEnElPlan() {
        return incluidaEnElPlan;
    }

    public void muestraFichaTecnica(){
        System.out.println("\nEl nombre de la pelicula es: " + nombre);
        System.out.println("El año del lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Su duracion es de: " + getDuracionEnMinutos());
    }

    public void evalua(double nota){
        sumaDePuntajes = sumaDePuntajes + nota;
        totalDeEvaluaciones++;
    }

    public   double calculaMedia(){
        return sumaDePuntajes / totalDeEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
       return this.getNombre().compareTo(otroTitulo.getNombre()) ;
    }
}
