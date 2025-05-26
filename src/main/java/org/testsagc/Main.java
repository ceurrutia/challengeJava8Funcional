package org.testsagc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Auto> listaAutos = Arrays.asList(
              new Auto("Citroen", "Zenda", 25000.60),
              new Auto("Volkswagen", "Golf", 21000.60),
              new Auto("Fiat", "Palio", 18000.60),
              new Auto("Volkswagen", "Corsa", 20000.60)

        );

        //Ordenar los costos de menor a mayor,
        // por defecto e metodo sort lo hace de menor a mayor

        //Crear lista nueva porque el sort la sobreescrribe y nooooo!!!

        System.out.println("Ordenar costos de menor a mayor");
        List<Auto> ordenPrecio = new ArrayList<Auto>(listaAutos);
        ordenPrecio.sort(Comparator.comparing(Auto::getCosto));
        ordenPrecio.forEach(System.out::println);

        //Ordenar por marca y pro precio ordenando con sorted
        System.out.println("******************");
        System.out.println("Marca y precio con sorted");
        listaAutos.stream()
                .sorted(Comparator.comparing(Auto::getMarca)
                .thenComparing(Auto::getCosto))
                .forEach(System.out::println);

        //Autos que no superen lso 23000 de costo
        System.out.println("******************");
        System.out.println("Autos que no superan los 23000");
        listaAutos.stream()
                .filter(auto-> auto.getCosto()<= 23000.100)
                .forEach(System.out::println);


        //Listar autos de marca Volkswagen o Citroen
        System.out.println("******************");
        System.out.println("Autos de marca volkswagen o Citroen");
        listaAutos.stream()
                .filter(auto->auto.getMarca().equals("Volkswagen") ||
                        auto.getMarca().equals("Citroen"))
                .forEach(System.out::println);


        //Autos cuyo modelo contiene la letra "a"
        System.out.println("******************");
        System.out.println("Contienen la letra a");
        listaAutos.stream()
                .filter(auto -> auto.getModelo().contains("a"))
                .forEach(System.out::println);
    }
}