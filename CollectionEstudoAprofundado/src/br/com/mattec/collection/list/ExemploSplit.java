package br.com.mattec.collection.list;

import java.util.Objects;

public class ExemploSplit {
    public static void main(String[] args) {
        String cep = "011111-320";

        String trocou = cep.replace("-", "");
        System.out.println(trocou);
     //   if (cep.contains("-"))
       //     System.out.println("tem");
        //}else{
         //   System.out.println("não tem");
       // }

      //  String[] split = cep.split("-", 0);
      //  String cepSemTraco="";
      //  for (String cp: split) {
      //      cepSemTraco += cp;
      //  }
      //  System.out.println(cepSemTraco);
    }
}
