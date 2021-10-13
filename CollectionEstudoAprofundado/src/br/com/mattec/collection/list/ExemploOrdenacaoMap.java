package br.com.mattec.collection.list;

import javax.xml.transform.sax.SAXResult;
import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("Criando um dicionário de livros");

        System.out.println("--\tOrdem aleatória\t--");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 200));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " --> " + livro.getValue().getNome());
        } ;// impressão personalizada

        System.out.println("--\tImprimir por ordem de inserção:\t--");
        // para isso sempre devemos utilizar o LindkedHashMap<>()
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 200));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
       // System.out.println(meusLivros1);// já imprime damaneiro que foir inserido
        for (Map.Entry<String, Livro> livro1: meusLivros1.entrySet()) {
            System.out.println(livro1.getKey() + " --> " + livro1.getValue().getNome());
        } ;// impressão personalizada

        System.out.println("--\tOrdem alfabético de autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro1: meusLivros2.entrySet()) {
            System.out.println(livro1.getKey() + " --> " + livro1.getValue().getNome());
        } ;// impressão personalizada
        System.out.println("--\tOrdem alfabética dos livros\t--");
        Set<Map.Entry<String,Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro1: meusLivros3) {
            System.out.println(livro1.getKey() + " --> " + livro1.getValue().getNome());
        } ;// impressão personalizada

        System.out.println("--\tOrdenar por número de páginas\t--");

        System.out.println("--\tnúmeros de páginas\t--");
        Set<Map.Entry<String,Livro>> meusLivros4 = new TreeSet<>(new ComparatorNomeLivro());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro1: meusLivros4) {
            System.out.println(livro1.getKey()+ " --> " + livro1.getValue().getNome() + "número de páginas -> "+ livro1.getValue().getPaginas());
        } ;// impressão personalizada











    }
}
class Livro{


    private String nome;
    private  Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
}
class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>>{


    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String , Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}
