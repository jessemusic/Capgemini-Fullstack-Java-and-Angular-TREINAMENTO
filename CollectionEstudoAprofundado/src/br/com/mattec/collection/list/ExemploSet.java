package br.com.mattec.collection.list;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        // dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça:
        // Set notas = new HashSet();// antes do jave 5
        //  Set<Double> notas = Set.of(7d,8.5,9.3,5d,2d,0d,3.5);
        //  notas.add(1d);
        //notas.remove(5d);
//        System.out.println(notas);
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());
        // não é possível exibir a nota e sua posição, não é possível subtituir uma nota pelo índice, pois o set não tem índice
        //não é possível adicionar a nota 8.0 na posição 4, pois não existem posições em SET
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exibindo a soma dos valores: " + soma);

        System.out.println("Exibir a média das notas : " + (soma / notas.size()));
        System.out.println(notas);
        System.out.println("---------------------------------");
        System.out.println("Remover a nota 0 ");
        notas.remove(0.0);
        System.out.println(notas);
        System.out.println("Remova notas menores que 7 e exibir na lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        Double soma1 = 0.0;
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);
        System.out.println("Exiba todos as notas na ordem em que foram adicionadas:");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("EXiba todas as notas na ordem crescente:");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println("Conferindo se o conjuntos notas esta vazio " + notas.isEmpty());
        System.out.println("Conferindo se o conjuntos notas2 esta vazio " + notas2.isEmpty());
        System.out.println("Conferindo se o conjuntos notas3 esta vazio " + notas.isEmpty());

    }
}
