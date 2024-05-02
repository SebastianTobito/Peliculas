package com.sebas.screenfilme.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sebas.screenfilme.exception.ErrorEnConversionDuracionException;
import com.sebas.screenfilme.modelos.Titulo;
import com.sebas.screenfilme.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce el nombre de la película que buscas: ");
        var busqueda = scanner.nextLine();

        String direccion = "https://www.omdbapi.com/?t="+busqueda.replace(" ", "+") +
                "&apikey=e212bfb";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(miTituloOmdb);

            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println("Titulo ya convertido: " + miTitulo);
        } catch (NumberFormatException e){
            System.out.println("Ocurrió un error");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Error en la URI, verifique la dirección");
            System.out.println(e.getMessage());
        } catch (ErrorEnConversionDuracionException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finalizó la ejecución del programa");
        }

    }
}
