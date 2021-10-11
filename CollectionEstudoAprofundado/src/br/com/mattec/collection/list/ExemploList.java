package br.com.mattec.collection.list;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.*;


public class ExemploList {

    public static void main(String[]args){

    //List notas = new ArrayList<>();// antes do java 5
   // ArrayList<Double> notas = new ArrayList<>(); // a partir do jdk 7(não recomendado)
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        // List<Double> notas = Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6);// porem nunca pode adicionar ou remover
        //notas.add(10d); // se executar essa linha vai gerar um erro abstractList
        //    System.out.println(notas);
       // List<Double> notas = List.of(7d,8.5,9.3,5d,7d,0d,3.6);// porem nunca pode adicionar ou remover
        //notas.add(1d); // não pode add
        //notas.remove(5d);// enem remover
        //System.out.println(notas);
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();//generics a partir do jdk 5
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());
        System.out.println("Exiba a posição da nota 5.0 é --> " + notas.indexOf(5d));
        System.out.println("Adicione a lista da nota 8.0 na posição e: ");
        notas.add(4, 8d);
        System.out.println(notas.toString());
        System.out.println("Substitui a nota 5.0 por a nota 7.0 ");
        notas.set(notas.indexOf(5d),6.0 );
        System.out.println(notas.toString());
        System.out.println("Confira se a nota 5.0 esta na lista!");
        boolean temNaLista = notas.contains(5d);
        System.out.println(temNaLista);
        for (Double nota: notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adicionada ---> "+ notas.get(2));
        System.out.println(notas.toString());
        System.out.println("Exiba a menor nota ---> "+ Collections.min(notas) + " e está " +
                "na posição " + notas.indexOf(Collections.min(notas)));

        System.out.println("Exiba a maior nota ---> "+ Collections.max(notas) + " e está " +
                "na posição " + notas.indexOf(Collections.max(notas)));
        System.out.println("Exiba a soma de todos os valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma=0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma +=next;
        }
        System.out.println(notas.toString());
        System.out.println("A soma de todos os valores são --> " + soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        System.out.println("Remova a nota 0 :");
        notas.remove(notas.indexOf(0d));
        System.out.println(notas.toString());
        System.out.println("Remova a nota da posição zero 0 :");
        notas.remove(0);
        System.out.println(notas.toString());
        System.out.println("Remova as notas menores que 7 e exiba em uma lista: ");
        System.out.println(notas.toString());
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            if(iterator1.next() < 7) iterator1.remove();
        }
        System.out.println(notas.toString());
        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas.toString());
        System.out.println("Confira se a lista estaá vazia" + notas.isEmpty());


    }
}
