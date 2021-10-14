package br.com.mattec.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.*;
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

        System.out.println("Pegar os número pares maiores que 2 e colocar em uma lista");

        List<Integer> list = numerosAleatorios.stream().map(Integer::parseInt)
                .filter(x -> (x % 2 == 0) && x > 2)
                .collect(Collectors.toList());
        System.out.println(list);

        System.out.println("Mostrar a média dos números");
        numerosAleatorios.stream().mapToInt(Integer::parseInt)
                .average().ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares");

        List<Integer> numerosImpares = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosImpares.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosImpares);

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);


    }

}
