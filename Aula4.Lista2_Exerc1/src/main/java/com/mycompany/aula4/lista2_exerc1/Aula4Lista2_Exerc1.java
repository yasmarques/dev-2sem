package com.mycompany.aula4.lista2_exerc1;

import java.util.Scanner;

public class Aula4Lista2_Exerc1 {

    public static void main(String[] args) {
        //Crie uma classe como o nome Soma 
        //Solicite 3 valores ao usuário
        //Some os 3 valores e multiplique por 10
        //o resultado da multiplicação divida por 2
        //Faça todas as operações em apenas 1(uma )linha
        //Exiba o resultado
        
        Scanner grava = new Scanner(System.in);
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        double res = 0;
        
        System.out.println("Digite 3 valores");
        valor1 = grava.nextDouble();
        valor2 = grava.nextDouble();
        valor3 = grava.nextDouble();
        
        res = ((valor1 + valor2 + valor3) * 10) / 2;
        
        System.out.println("O resultado é: " + res);
    }
}
