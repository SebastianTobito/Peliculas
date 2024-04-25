package com.sebas.screenfilme.calculos;

public class FiltroRecomendaciones {
   public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion()>=4){
            System.out.println("Bien evaluado");
        } else if (clasificacion.getClasificacion() == 2) {
            System.out.println("Popular en el momento");
        }else{
            System.out.println("Miralo después");
        }
    } 
}
