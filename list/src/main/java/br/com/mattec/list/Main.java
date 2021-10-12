package br.com.mattec.list;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       // metodoList();
    Set<Carro> hashSetCarros = new HashSet<>();

    hashSetCarros.add(new Carro("Ford"));
    hashSetCarros.add(new Carro("Chevrolet"));
    hashSetCarros.add(new Carro("Fiat"));
    hashSetCarros.add(new Carro("Peugeot"));
    hashSetCarros.add(new Carro("Zip"));
    hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarros);
        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCarros);






    }

    private static void metodoList() {
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros.contains(new Carro("Ford")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Fiat")));
        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }

}
