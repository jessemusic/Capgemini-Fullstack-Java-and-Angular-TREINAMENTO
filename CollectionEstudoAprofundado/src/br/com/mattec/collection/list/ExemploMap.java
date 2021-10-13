package br.com.mattec.collection.list;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("Crie um dic ionárfioque relacione os modelos e seus respectivos consumos! ");

        Map<String, Double> carrosPolpulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mod1", 16.1);
            put("hb20", 13.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPolpulares.toString());

        System.out.println("Substitua a consumo do gol por 1q5,23 km/L:");
        carrosPolpulares.put("gol", 17.1);
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

        String modeloMuitoMaisEfieciente ="";
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMuitoMaisEfieciente = entry.getKey();
                System.out.println("modelo mais eficiente: " + modeloMuitoMaisEfieciente + " --> " + consumoMaisEficiente);
            }
        }
        System.out.println("--------------------modelo menos econômico--------------");
        System.out.println("Exiba o modelo menos econômico:");

        Double minConsumoEficiente = Collections.min(carrosPolpulares.values());
        String modeloMenoEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPolpulares.entrySet()) {
            if (entry.getValue().equals(minConsumoEficiente)) {
                modeloMenoEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenoEficiente
                        + "----> " + minConsumoEficiente);
            }
        }

            System.out.println("Exiba a soma dos consumos:");

            Iterator<Double> iterator = carrosPolpulares.values().iterator();
            Double soma = 0d;
            while(iterator.hasNext()){
                soma+= iterator.next();
            }
            System.out.println("A soma dos consumos são: " + soma);

            System.out.println("----------exibir a média-------------");

            System.out.println("exiba a média dos consumos desta lista de carros: ");
            System.out.println("A média é: " + soma/carrosPolpulares.size());

            System.out.println("----------------remoção-----------------");
            System.out.println("Remova os modelos com consumo igual a 15,6 km/L: ");
            System.out.println(carrosPolpulares);
            Iterator<Double> iterator1 = carrosPolpulares.values().iterator();
            while(iterator1.hasNext()){
                if(iterator1.next().equals(15.6)) iterator1.remove();
            }
            System.out.println(carrosPolpulares);

        System.out.println("Exiba todos os carros na ordem que formam informados");
        Map<String, Double> carrosPolpulares1 = new LinkedHashMap<>() {{
            //Para estar dentro de um ordem des inserção, devemos usar o LinkedHashMap<>()
            put("gol", 14.4);
            put("uno", 15.6);
            put("mod1", 16.1);
            put("hb20", 13.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPolpulares1.toString());
        System.out.println("Exiba a lista de carros ordenados pelo modelo:");
        Map<String,Double> carrosPopulares2 = new TreeMap<>(carrosPolpulares1);
        // Neste caso a ordenação é feito pelas chaves que são Strings, portanto o TreeMap irá
        // devolver a lista ordenada das chaves por ordem alfabética.
        System.out.println(carrosPopulares2.toString());


        System.out.println("Apagar a lista de carros:");
        System.out.println("Vamos apagar a primeira lista carroPopulares:");
        System.out.println("Lista antes de apagar");
        System.out.println(carrosPolpulares);

        System.out.println("Primeira lista carroPopulares apagada:");
        carrosPolpulares.clear();
        System.out.println(carrosPolpulares);
        System.out.println("Vamos conferir se está vazio");
        System.out.println(carrosPolpulares.isEmpty());











    }
}
