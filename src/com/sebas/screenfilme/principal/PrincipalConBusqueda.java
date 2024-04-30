package com.sebas.screenfilme.principal;

import com.google.gson.Gson;
import com.sebas.screenfilme.modelos.Titulo;

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

         String direccion = "https://www.omdbapi.com/?t="+busqueda+"&apikey=e212bfb";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        System.out.println(json);

        Gson gson = new Gson();

        Titulo miTitulo = gson.fromJson(json, Titulo.class);

        System.out.println(miTitulo);

    }
}
