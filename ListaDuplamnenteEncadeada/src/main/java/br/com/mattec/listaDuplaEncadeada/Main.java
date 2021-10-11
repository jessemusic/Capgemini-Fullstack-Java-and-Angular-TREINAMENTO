package br.com.mattec.listaDuplaEncadeada;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListDuplamenteEncadeada.add("c1");
        minhaListDuplamenteEncadeada.add("c2");
        minhaListDuplamenteEncadeada.add("c3");
        minhaListDuplamenteEncadeada.add("c4");
        minhaListDuplamenteEncadeada.add("c5");
        minhaListDuplamenteEncadeada.add("c6");
        minhaListDuplamenteEncadeada.add("c7");
        System.out.println(minhaListDuplamenteEncadeada);
        minhaListDuplamenteEncadeada.remove(3);
        minhaListDuplamenteEncadeada.add(3,"99");
        System.out.println(minhaListDuplamenteEncadeada);
        System.out.println(minhaListDuplamenteEncadeada.get(3));


    }
}
