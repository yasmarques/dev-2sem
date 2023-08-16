
package com.mycompany.aula4.lista1_exerc5;

import java.util.Scanner;

public class Aula4Lista1_Exerc5 {

    public static void main(String[] args) {
        //Solicite via teclado um valor de 1 a 9 e mostre na tela a tabuada referente ao valor 
        //Exemplo : Digite a tabuada solicitada 5
        //5 x 1 = 5
        //5 x 2 = 10...
        //5 x 10 = 50
        
        Scanner grava = new Scanner(System.in);
        
        int valor = 0;
        int res1 = 0;
        int res2 = 0;
        int res3 = 0;
        int res4 = 0;
        int res5 = 0;
        int res6 = 0;
        int res7 = 0;
        int res8 = 0;
        int res9 = 0;
        int res10 = 0;
        
        System.out.println("Digite a tabuada desejada:");
        valor = grava.nextInt();
        
        res1 = valor * 1;
        res2 = valor * 2;
        res3 = valor * 3;
        res4 = valor * 4;
        res5 = valor * 5;
        res6 = valor * 6;
        res7 = valor * 7;
        res8 = valor * 8;
        res9 = valor * 9;
        res10 = valor * 10;
        
        System.out.println(valor + " X 1" + " = " + res1);
        System.out.println(valor + " X 2" + " = " + res2);
        System.out.println(valor + " X 3" + " = " + res3);
        System.out.println(valor + " X 4" + " = " + res4);
        System.out.println(valor + " X 5" + " = " + res5);
        System.out.println(valor + " X 6" + " = " + res6);
        System.out.println(valor + " X 7" + " = " + res7);
        System.out.println(valor + " X 8" + " = " + res8);
        System.out.println(valor + " X 9" + " = " + res9);
        System.out.println(valor + " X 10" + " = " + res10);
    }
}
