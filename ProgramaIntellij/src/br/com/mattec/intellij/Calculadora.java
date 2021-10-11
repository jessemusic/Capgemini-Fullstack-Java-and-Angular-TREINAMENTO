package br.com.mattec.intellij;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b;
        System.out.println("Digite o primeiro número: ");
        a= leer.nextInt();
        System.out.println("Digite o segundo número: ");
        b= leer.nextInt();
        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);
        System.out.println("soma " + somar);
        System.out.println("subtrair " + subtrair);
        System.out.println("multiplicar " + multiplicar);
        System.out.println("dividir " + dividir);
        leer.close();

    }

    public static int somar(int a, int b){
        return a+b;
    }
    public static int subtrair(int a, int b){
        return a-b;
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
    public static int dividir(int a, int b){
        return a/b;
    }
}
