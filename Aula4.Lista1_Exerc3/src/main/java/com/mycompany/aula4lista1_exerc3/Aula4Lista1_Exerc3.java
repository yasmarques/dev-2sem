
package com.mycompany.aula4lista1_exerc3;

import java.util.Scanner;

public class Aula4Lista1_Exerc3 {

    public static void main(String[] args) {
        //Crie 3 variaveis do tipo String , solicite as informções via teclado e como resultado concactene as 3
        
        Scanner grava = new Scanner(System.in);
        String palavra1 = "";
        String palavra2 = "";
        String palavra3 = "";
        
        System.out.println("Digite as 3 palavras desejas:");
        palavra1 = grava.next();
        palavra2 = grava.next();
        palavra3 = grava.next();
        
        System.out.println(palavra1 + " " + palavra2 + " " + palavra3);
    }
}
