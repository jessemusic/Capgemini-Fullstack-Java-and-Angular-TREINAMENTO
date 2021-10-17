package br.com.mattec.desafios;

import java.util.Scanner;

public class Problem {
    //complete os espaços em branco com sua solução
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
       int i = n;
        while (i != 0){
            if (n % i == 0) {
                System.out.println(   n/i    );
            }
            i--;
        }
    }
}
