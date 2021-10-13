package br.com.mattec.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1","0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprima os elementos desta lista:");

        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 últimos primeiro registros e coloque dentro de um Set");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme essa lista em uma lista de números inteiros");
        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList())
                .forEach(System.out::println);



    }

}
