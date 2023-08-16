
package com.mycompany.aula4.lista2_exerc3;

import java.util.Scanner;

public class Aula4Lista2_Exerc3 {

    public static void main(String[] args) {
        //Solicite ao usuário um nome 
        //solicite ao usuário um valor
        //concatene as duas informações 
        //Exiba o resultado

        Scanner grava = new Scanner(System.in);
        
        String nome = "";
        double valor = 0;
        
        System.out.println("Digite seu nome: ");
        nome = grava.next();
        
        System.out.println("Digite um valor: ");
        valor = grava.nextDouble();
        
        System.out.println("Seu nome é " + nome + " e você digitou o número " + valor);
    }
}
