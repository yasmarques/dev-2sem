
package com.mycompany.aula4.lista2_exerc2;

import java.util.Scanner;

public class Aula4Lista2_Exerc2 {

    public static void main(String[] args) {
        //Solicite ao usuário um valor em reais 
        //Desse valor tire 6% 
        //Some ao resultado dessa operação o valor 10
        //Divida por 4
        //Mostre o resultado
        
        Scanner grava = new Scanner(System.in);
        
        double valor = 0, res1 = 0, res2 = 0, res3 = 0, res4 = 0;
        
        System.out.println("Digite o valor desejado:");
        valor = grava.nextDouble();
        
        res1 = valor * 0.06;
        res2 = valor - res1;
        res3 = res2 + 10;
        res4 = res3 / 4;
        
        System.out.println("O resultado é: " + res4);
    }
}
