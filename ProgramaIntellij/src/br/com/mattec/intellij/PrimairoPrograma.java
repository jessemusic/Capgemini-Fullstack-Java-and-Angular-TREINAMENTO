package br.com.mattec.intellij;


import br.com.mattec.intellij.model.Gato;

import java.util.Objects;

public class PrimairoPrograma {
    public static void main(String[] args) {
      //  int a=50;
      //  int b=10;
        //  System.out.println("Hello Jesse " + (a+b));
        Gato gato = new Gato("Edjon","AMARelo",16);
        System.out.println(gato);
        System.out.println(gato);
        Livro livro = new Livro("O problema dos 4 corpos",500);
        System.out.println(livro);
    }
}

class Livro{
    private  String nome;
    private  Integer numPaginas;

    public Livro() {
    }

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numPaginas, livro.numPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPaginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
