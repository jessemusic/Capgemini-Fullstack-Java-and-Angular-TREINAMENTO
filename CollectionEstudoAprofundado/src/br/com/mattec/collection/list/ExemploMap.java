package br.com.mattec.collection.list;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("Crie um dic ionárfioque relacione os modelos e seus respectivos consumos! ");

        Map<String, Double> carrosPolpulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mod1", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPolpulares.toString());

        System.out.println("Substitua a consumo do gol por 1q5,23 km/L:");
        carrosPolpulares.put("gol", 15.2);
        System.out.println(carrosPolpulares);

    }
}
