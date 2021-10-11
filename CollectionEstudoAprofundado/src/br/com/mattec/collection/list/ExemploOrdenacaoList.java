package br.com.mattec.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {


        List<Aluno> alunos = new ArrayList<>() {{
            add(new Aluno("Jesse",19,"Oitava A"));
            add(new Aluno("Antonio",35,"Terceiro B"));
            add(new Aluno("Linda",13,"Quinta C"));
            add(new Aluno("Antonio",13,"Sexta C"));
            add(new Aluno("Gritania",19,"Oitava A"));

        }};

        System.out.println("--\tOrdem de inserção\t--");
        System.out.println(alunos);

        System.out.println("--\tOrdem aleatória\t--");
        Collections.shuffle(alunos);
        System.out.println(alunos);

        System.out.println("--\tOrdem Natural\t--");
      Collections.sort(alunos);//Cellections tem o método sort()
        System.out.println(alunos);
//______________________Necessário a interface comparator______________
        System.out.println("--\tOrdem Idade\t--");
        Collections.sort(alunos,(aluno1, aluno2) -> Integer.compare(aluno1.getIdade(),aluno2.getIdade()));
        System.out.println("Primeiro caso : " + alunos);
        Collections.sort(alunos,new ComparatorIdade());
        System.out.println("Segundo caso : " + alunos);
        alunos.sort(new ComparatorIdade());
        System.out.println("terceiro caso : " + alunos);

        System.out.println("--\tOrdem série\t--");
        Collections.sort(alunos,new ComparatorSerie());
        System.out.println("Por ordem de séries : " + alunos);


        System.out.println("--\tOrdem Nome/Idade/Série\t--");
        Collections.sort(alunos,new ComparatorNomeIdadeSerie());
        System.out.println("Por nome,idades e séries : " + alunos);
    }
}

class  Aluno  implements  Comparable<Aluno>{
    private String nome;
    private Integer idade;
    private String Serie;

    public Aluno(String nome, Integer idade, String serie) {
        this.nome = nome;
        this.idade = idade;
        Serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getSerie() {
        return Serie;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", Serie='" + Serie + '\'' +
                '}';
    }

    @Override
    public int compareTo(Aluno obj) {
        return this.getNome().compareToIgnoreCase(obj.getNome());

    }
}
class  ComparatorIdade implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Integer.compare(o1.getIdade(),o2.getIdade());
    }
}

class ComparatorSerie implements  Comparator<Aluno>{
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.getSerie().compareToIgnoreCase(aluno2.getSerie());
    }
}
class ComparatorNomeIdadeSerie implements  Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        int nome =  aluno1.getNome().compareToIgnoreCase(aluno2.getNome());
        if(nome != 0) return nome;

        int serie = aluno1.getSerie().compareToIgnoreCase(aluno2.getSerie());
        if(serie != 0) return serie;

        return Integer.compare(aluno1.getIdade(), aluno2.getIdade());
    }
}
