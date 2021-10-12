package br.com.mattec.equalshashcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // testaCarro();
      //  usandoStack();
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);
        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros);




    }

    private static void usandoStack() {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrfolet"));
        stackCarros.push(new Carro("Fial"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());
    }

    private static void testaCarro() {
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println((new Carro("Ford").hashCode()));
        System.out.println((new Carro("Ford1").hashCode()));

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println(carro1.equals(carro2));
    }
}
