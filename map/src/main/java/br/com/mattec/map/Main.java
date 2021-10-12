package br.com.mattec.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Média", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

            listaAlunos.add(aluno);
        Map<String, String> aluno1 = new HashMap<>();

        aluno1.put("Nome", "Mario");
        aluno1.put("Idade", "16");
        aluno1.put("Média", "8.0");
        aluno1.put("Turma", "3b");

        listaAlunos.add(aluno1);
        System.out.println(listaAlunos);

        System.out.println(listaAlunos.contains("Nome"));

    }
}
