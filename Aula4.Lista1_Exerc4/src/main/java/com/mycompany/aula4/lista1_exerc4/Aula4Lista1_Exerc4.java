

package com.mycompany.aula4.lista1_exerc4;

import java.util.Scanner;

public class Aula4Lista1_Exerc4 {

    public static void main(String[] args) {
        //Solicite via teclado 2 valores e de como resultado : 
        //(A)+(b)= (C)
        //(A)*(b)=(c)
        //(A)/(b)= (c)
        //(A)-(b)= (c)

        Scanner grava = new Scanner(System.in);
        
        int valor1 = 0;
        int valor2 = 0;
        int res1 = 0;
        int res2 = 0;
        int res3 = 0;
        int res4 = 0;
        
        System.out.println("Digite os valores desejados:");
        valor1 = grava.nextInt();
        valor2 = grava.nextInt();
        
        res1 = valor1 + valor2;
        res2 = valor1 - valor2;
        res3 = valor1 * valor2;
        res4 = valor1 / valor2;
        
        System.out.println(valor1 + " + " + valor2 + " = " + res1);
        System.out.println(valor1 + " - " + valor2 + " = " + res2);
        System.out.println(valor1 + " * " + valor2 + " = " + res3);
        System.out.println(valor1 + " / " + valor2 + " = " + res4);
    }
}
