/*
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.


Exemplo de Entrada	Exemplo de Saída
8

9
11
13
15
17
19
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;
        int neg=0;
//continue a solucao de acordo com o solicitado no enunciado

        if(x % 2 != 0){
            x=x;
            cont=1;
            System.out.println(x);
        }

        if(x == 0){
            x=1;
            cont=1;
            System.out.println(x);
        }else if(x % 2 == 0){
            x=x+1;
           neg =-1;
        }
        while (cont < 6) {
            if(x % 2 != 0) {
                if(neg == -1) {
                    System.out.println(x);
                    neg=0;
                    cont++;
                }
                System.out.println(x += 2);
                cont++;
            }
        }
    }

}