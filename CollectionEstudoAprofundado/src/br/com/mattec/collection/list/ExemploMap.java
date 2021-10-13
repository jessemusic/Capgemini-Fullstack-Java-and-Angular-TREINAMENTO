package br.com.mattec.collection.list;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        carrosPolpulares.put("gol", 16.1);
        System.out.println(carrosPolpulares);

        System.out.println("Confira se o modelo tucson está no icionário de carros:" +
                " " + carrosPolpulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno:" + carrosPolpulares.get("uno"));

       // System.out.println("Exiba o terceiro modelo adicionado!...... não é possível encontrar o índice neste map");
        System.out.println("exiba os modelos!");
        Set<String> modelos = carrosPolpulares.keySet();
        System.out.println("Exiba os modelos dos carros:");
        System.out.println(modelos);
        System.out.println("Qual o modelo mais eficiente: ");
        Double consumoMaisEficiente = Collections.max(carrosPolpulares.values());
        System.out.println(consumoMaisEficiente);
        Set<Map.Entry<String, Double>> entries = carrosPolpulares.entrySet();
        
        String modelomjuitomaisEfieciente ="";
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modelomjuitomaisEfieciente = entry.getKey();
                System.out.println("modelo mais eficiente: " + modelomjuitomaisEfieciente + " --> " + consumoMaisEficiente);
            }
        }


    }
}
